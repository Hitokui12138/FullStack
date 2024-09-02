package com.lin.missyou.sample.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class IreliaCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //通过ConditionContext获得properties文件的数据
        String name = conditionContext.getEnvironment().getProperty("hero.condition");
        //return name.equalsIgnoreCase("irelia");
        return "irelia".equalsIgnoreCase(name);
    }
}
