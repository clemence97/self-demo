package com.test;

import com.example.excel.Domain;
import lombok.Data;

@Data
public class ConcertBase extends Base {

    private Long subTypeInfoId;

    private Domain data;
}



