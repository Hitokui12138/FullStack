package com.lin.missyou.validators;

import com.lin.missyou.dto.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 注解的关联类
 * 1. 实现接口ConstraintValidator
 * 2.范型里面
 *      1. 关联的注解的类型,PasswordEqual
 *      2. 修饰的目标的类型,PersonDTO,如果是其他,则String等等
 * 3. 具体校验逻辑写在isValid()里面
 */
public class PasswordValidator implements ConstraintValidator<PasswordEqual, PersonDTO> {
    private int min;
    private int max;
    private String message;
    /**
     * 这个方法可以拿到注解上的参数
     * @param constraintAnnotation
     */
    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
        this.message = constraintAnnotation.message();
    }

    /**
     * 这个方法用于进行业务判断
     * @param personDTO
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        String password1 = personDTO.getPassword1();
        String password2 = personDTO.getPassword2();
        boolean match = password1.equals(password2);
        return match;
    }
}
