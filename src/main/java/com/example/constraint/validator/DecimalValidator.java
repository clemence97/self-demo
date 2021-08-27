package com.example.constraint.validator;


import com.example.constraint.annotation.DecimalFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigDecimal;

public class DecimalValidator implements ConstraintValidator<DecimalFormat, String> {


    @Override
    public void initialize(DecimalFormat constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        try {
            new BigDecimal(s);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
