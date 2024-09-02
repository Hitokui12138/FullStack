package com.lin.missyou.sample;

import com.lin.missyou.sample.condition.DianaCondition;
import com.lin.missyou.sample.condition.IreliaCondition;
import com.lin.missyou.sample.hero.Camille;
import com.lin.missyou.sample.hero.Diana;
import com.lin.missyou.sample.hero.Irelia;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {
    /**
     * 第一个方法用于返回一个ISkill对象
     * 因为返回一个Bean,因此打上@Bean注解
     * @Configuration + @Bean = 可以让这个Bean进入IoC容器了
     */


    /**
     * 可以在return之前调用setter等方法给这个实例的属性赋值
     * 类似于XML,@Component是不能在初始化前赋值的
     */
    @Bean
    @Conditional(DianaCondition.class)//false
    public ISkill diana(){
        return new Diana();
    }
    @Bean
    //@Conditional(IreliaCondition.class)
    //@ConditionalOnProperty(value = "hero.condition", havingValue="irelia", matchIfMissing = true)
    //@ConditionalOnBean(name="mysql")
    public ISkill irelia(){
        return new Irelia();
    }

}
