package com.example.service;

import com.example.service.Mapper;
import com.example.service.Service;
import com.example.service.ServiceImpl;


public class ServiceMain {

    private static String entityPath =
            "D:\\aoto_code\\GeneratorEntity\\GeneratorEntity\\entitys2\\com\\humancloud\\saas\\entity\\";

    private static String destServicePath = "D:\\aoto_code\\service\\";

    private static String destServiceImplPath = "D:\\aoto_code\\serviceimpl\\";

    private static String destMapperPath = "D:\\aoto_code\\sqlMap\\";



    public static void main(String []args) throws Exception {


        String className = "ChannelDispatchBatchRelaInfoEntity";

        Service.genService(className, destServicePath);

        ServiceImpl.genImpl(className, destServiceImplPath);

        Mapper.genMapper(className, entityPath, destMapperPath);
    }









}
