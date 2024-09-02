package com.lin.missyou.sample;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 这个类用于验证自定义SpringBoot启动类
 * 验证Import与Selector结合的用法
 */
public class LOLConfigurationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //数组,可以追加多个配置类的全名
        return new String[]{HeroConfiguration.class.getName()};
    }
}
