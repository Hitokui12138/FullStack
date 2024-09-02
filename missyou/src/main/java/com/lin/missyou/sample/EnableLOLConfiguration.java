package com.lin.missyou.sample;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * 与LOLConfigurationSelector结合使用
 */
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)

@Import(LOLConfigurationSelector.class)
public @interface EnableLOLConfiguration {
}
