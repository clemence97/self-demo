package com.example.spi.dubboSPI;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface PrintService {

    void printInfo();
}
