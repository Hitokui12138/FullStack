package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

/**
 * 加入容器的过程
 * 打上@Component之后,SpringBoot就会在·启动时·负责这个类的实例化
 *
 * 现在使用配置类进行加载,因此删掉了@Component
 */
//@Component 现在使用配置类进行加载,因此删掉了@Component
public class Diana implements ISkill {
    public Diana(){
        System.out.println("Diana instance is 实例化");
    }
    public void q(){
        System.out.println("Diana Q");
    }
    public void w(){
        System.out.println("Diana W");
    }
    public void e(){
        System.out.println("Diana E");
    }
    public void r(){
        System.out.println("Diana R");
    }
}
