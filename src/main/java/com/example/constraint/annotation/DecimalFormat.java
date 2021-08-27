package com.example.constraint.annotation;


import com.example.constraint.validator.DecimalValidator;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({METHOD, FIELD, PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DecimalValidator.class)// 与约束注解关联的校验器
public @interface DecimalFormat {

    // 错误提示信息
    String message() default "必须为小数";

    Class[] groups() default {};

    Class[] payload() default {};
}
