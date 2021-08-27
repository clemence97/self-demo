package com.test;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BaseAware implements BeanNameAware {

    @Resource
    private Base base;

    @Override
    public void setBeanName(String name) {
        System.out.println(base);
        System.out.println("aware");
    }
}
