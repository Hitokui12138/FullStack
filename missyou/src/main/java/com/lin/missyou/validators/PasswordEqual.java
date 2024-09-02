package com.lin.missyou.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义校验注解
 */
@Documented//将注释也加入文档
@Retention(RetentionPolicy.RUNTIME)//保留至运行阶段
@Target({ElementType.TYPE, ElementType.FIELD})//这个注解可以运行到那些对象上
@Constraint(validatedBy = PasswordValidator.class)//传入元类进行关联
public @interface PasswordEqual {
    int min() default 4;//在注解里只能用基本类型
    int max() default 20;
    //1.定义一个用来提示的文本
    String message() default "两次密码不相同";
    //2.自定义校验注解的两个模版方法
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default{};
}
