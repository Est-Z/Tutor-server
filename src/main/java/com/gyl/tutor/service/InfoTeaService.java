package com.gyl.tutor.service;

import com.gyl.tutor.dao.InfoTeaDao;
import com.gyl.tutor.pojo.InfoStu;
import com.gyl.tutor.pojo.InfoTea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InfoTeaService {

    @Autowired
    InfoTeaDao infoTeaDao;


    public int getID(){
        int len = infoTeaDao.findAll().size();
        return len+1;
    }

    public void updateInfoStu(InfoTea infoTea){
        infoTeaDao.save(infoTea);
    }

    public InfoTea getUserByOpenid(String openid){
        return infoTeaDao.getUserByOpenid(openid);
    }

    public List<InfoTea> findByCondition(String hopeSex, String hopeExp, String grade){

        InfoTea infoTea = new InfoTea();
        List<InfoTea> teachers; //result


        System.out.println(hopeSex+" "+ hopeExp);
        String teaGrade = stuGrade2TeaGrade(grade);

        if( hopeSex.equals("均可") && hopeExp.equals("均可")){
            teachers = infoTeaDao.findByTeaGrade(teaGrade);
        }else if(!hopeSex.equals("均可")){
            teachers = infoTeaDao.findBySexAndTeaGrade(hopeSex,teaGrade);
        }else  if(!hopeExp.equals("均可")){
            teachers = infoTeaDao.findByIsExpAndTeaGrade(hopeExp,teaGrade);
        }else{
            teachers = infoTeaDao.findBySexAndIsExpAndTeaGrade(hopeSex,hopeExp,teaGrade);
        }
        return teachers;
    }

    private String stuGrade2TeaGrade(String grade){
        String teaGrade = "";
        String[] arr1 = {"一年级","二年级","三年级","四年级","五年级","六年级"};
        String[] arr2 = {"初一","初二","初三"};
        String[] arr3 = {"高一","高二","高三"};

        List<String> arr1List = new ArrayList<String>();
        arr1List= Arrays.asList(arr1);

        List<String> arr2List = new ArrayList<String>();
        arr2List= Arrays.asList(arr2);

        List<String> arr3List = new ArrayList<String>();
        arr3List= Arrays.asList(arr3);

        if (arr1List.contains(grade)==true){
            teaGrade = "小学";
        }else if (arr2List.contains(grade)==true){
            teaGrade = "初中";
        }else if(arr3List.contains(grade)==true){
            teaGrade = "高中";
        }else{

        }

        return teaGrade;
    }
}
