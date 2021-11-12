package com.example.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class JavaSPI {

    public static void main(String[]args){
        PrintService defaultExtension = ExtensionLoader.getExtensionLoader(PrintService.class).getDefaultExtension();
        defaultExtension.printInfo();
    }
}
