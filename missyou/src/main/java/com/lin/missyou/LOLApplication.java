package com.lin.missyou;

import com.lin.missyou.sample.EnableLOLConfiguration;
import com.lin.missyou.sample.HeroConfiguration;
import com.lin.missyou.sample.ISkill;
import com.lin.missyou.sample.LOLConfigurationSelector;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 不使用@SpringBootApplication,从而验证@Enable机制
 */
//@ComponentScan
//@Import(LOLConfigurationSelector.class)
@EnableLOLConfiguration
public class LOLApplication {
    public static void main(String[] args) {
        //替代原来的run()
        ConfigurableApplicationContext context = new SpringApplicationBuilder(LOLApplication.class)
                .web(WebApplicationType.NONE) //不要求服务器
                .run(args);
        //验证这个启动类能不能把Bean加入容器
        ISkill iSkill = (ISkill) context.getBean("irelia");
        iSkill.r();
    }
}
