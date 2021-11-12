package com.example.service;

import com.example.service.Mapper;
import com.example.service.Service;
import com.example.service.ServiceImpl;


public class ServiceMain {

    private static String entityPath =
            "D:\\auto_code\\GeneratorEntity\\GeneratorEntity\\entitys2\\com\\humancloud\\saasflow\\entity\\";

    private static String destServicePath = "D:\\auto_code\\service\\";

    private static String destServiceImplPath = "D:\\auto_code\\serviceimpl\\";

    private static String destMapperPath = "D:\\auto_code\\sqlMap\\";



    public static void main(String []args) throws Exception {


        String className = "PemissionCoopFieldEntity";

        Service.genService(className, destServicePath);

        ServiceImpl.genImpl(className, destServiceImplPath);

        Mapper.genMapper(className, entityPath, destMapperPath);
    }









}
