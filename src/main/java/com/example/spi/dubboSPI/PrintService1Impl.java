package com.example.spi.dubboSPI;


import com.example.spi.javaSPI.PrintService;

public class PrintService1Impl implements PrintService {

    @Override
    public void printInfo() {
        System.out.println("Service1Impl");
    }
}
