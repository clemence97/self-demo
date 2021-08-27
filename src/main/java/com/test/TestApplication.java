package com.test;

import com.alibaba.fastjson.JSON;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.*"})
@MapperScan("com.database.dao")
public class TestApplication {

    public static void main(String []args){

        SpringApplication.run(TestApplication.class, args);

    }

}
