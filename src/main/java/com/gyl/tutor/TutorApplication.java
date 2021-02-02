package com.gyl.tutor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@MapperScan("com.gyl.tutor")
@SpringBootApplication
public class TutorApplication {
	public static void main(String[] args) {
		SpringApplication.run(TutorApplication.class, args);
	}
}
