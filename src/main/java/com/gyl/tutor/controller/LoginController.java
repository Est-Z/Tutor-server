package com.gyl.tutor.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gyl.tutor.dao.UserDao;
import com.gyl.tutor.service.UserService;
import com.gyl.tutor.utils.HttpUtils;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 

import com.gyl.tutor.pojo.CustomResult;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
 
    @Autowired
    UserService userService;

    static private String APPID = "wxfcc73a88629406fc";
    static private String APPSECRET = "a9aa6d5eaf312cee421b994533b53e0b";


    private String getOpenidFromJson(String httpResult) throws JSONException {
        JSONObject jsonObject = new JSONObject(httpResult);
        return jsonObject.getString("openid");
    }


    @GetMapping("/api/login")
    public CustomResult Login(String code) throws IOException, JSONException {
        System.out.println("code:" + code);
        //GET https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code

        String urlHeader = "https://api.weixin.qq.com/sns/jscode2session";

        Map<String, String> urlParams = new HashMap<>();
        urlParams.put("appid", APPID);
        urlParams.put("secret", APPSECRET);
        urlParams.put("js_code", code);
        urlParams.put("grant_type", "authorization_code");

        //拿到openid
        String httpResult = HttpUtils.getResponse(urlHeader, urlParams);
        String openid = getOpenidFromJson(httpResult);

        int count = userService.getUserNumByOpenid(openid);
        int status = 0;
        if(count==1){
            //用户已存在
            status = 1;
        }else{
            //用户不存在
            status = 0;
        }
        System.out.println(count);

        return new CustomResult(httpResult,status);
    }
}