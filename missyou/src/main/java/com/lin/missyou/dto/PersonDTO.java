package com.lin.missyou.dto;

import com.lin.missyou.validators.PasswordEqual;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;

/**
 * 数据传输用的JSON对象
 * 使用lombok的注解简化GetterSetter
 */

//@Getter
//@Setter
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor

@Builder
@Getter
@PasswordEqual(min = 5)
public class PersonDTO {
    @Length(min = 2, max = 10, message = "name长度不符合规范")
    private String name;
    private Integer age;
    @Valid
    private SchoolDTO schoolDTO;

    private String password1;
    private String password2;
}
