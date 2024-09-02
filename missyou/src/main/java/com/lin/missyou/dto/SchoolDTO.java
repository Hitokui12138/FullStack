package com.lin.missyou.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class SchoolDTO {
    @Length(min=2)
    private String schoolName;
}
