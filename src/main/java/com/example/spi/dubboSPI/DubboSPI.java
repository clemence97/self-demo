package com.example.spi.dubboSPI;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class DubboSPI {
    public static void main(String[]args){
        PrintService defaultExtension = ExtensionLoader.getExtensionLoader(PrintService.class).getExtension("impl");
        defaultExtension.printInfo();
    }
}
