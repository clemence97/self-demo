//package com.example.constraint.demo;
//
//
//import com.alibaba.fastjson.JSON;
//import com.example.constraint.domain.Domain;
//import org.springframework.validation.annotation.Validated;
//
//import javax.validation.Valid;
//
//@Validated
//public class TestConstration {
//
//    public static void main(String []args){
//         Domain domain = new Domain();
//         domain.setEmpFee("1.22");
//         domain.setOrgFee("这个世界");
//         getDoamin(domain);
//    }
//
//    private static void getDoamin(@Valid Domain domain){
//        System.out.println(JSON.toJSONString(domain));
//    }
//}
