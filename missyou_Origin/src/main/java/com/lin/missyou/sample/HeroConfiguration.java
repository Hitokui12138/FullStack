/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-12-28 08:54
 */
package com.lin.missyou.sample;


import com.lin.missyou.sample.hero.Diana;
import com.lin.missyou.sample.hero.Irelia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@Scope("prototype")
public class HeroConfiguration {
//    @Bean
    public ISkill diana() {
        return new Diana("Diana", 18);
    }

    @Bean
    @Scope("prototype")
    public ISkill irelia() {
        return new Irelia();
    }

}

