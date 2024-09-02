package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

/**
 * 这个类用于演示主动注入和被动注入
 */
//@Component 现在使用配置类进行加载,因此删掉了@Component
public class Irelia implements ISkill {
    public Irelia(){
        System.out.println("Irelia instance is 实例化");
    }
    public void q(){
        System.out.println("Irelia Q");
    }
    public void w(){
        System.out.println("Irelia W");
    }
    public void e(){
        System.out.println("Irelia E");
    }
    public void r(){
        System.out.println("Irelia R");
    }
}
