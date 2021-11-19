package com.example.spi.javaSPI;


import com.example.spi.javaSPI.PrintService;

public class PrintService2Impl implements PrintService {

    @Override
    public void printInfo() {
        System.out.println("Service2Impl");
    }
}
