package com.example.constraint.domain;

import com.example.constraint.annotation.DecimalFormat;
import lombok.Data;

@Data
public class Domain {

    @DecimalFormat
    private String empFee;

    @DecimalFormat
    private String orgFee;

}
