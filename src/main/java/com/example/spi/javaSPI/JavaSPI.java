package com.example.spi.javaSPI;


import java.util.ServiceLoader;

public class JavaSPI {

    public static void main(String[]args){
        ServiceLoader<PrintService> load = ServiceLoader.load(PrintService.class);
        for(PrintService printService : load){
            printService.printInfo();
        }
    }
}
