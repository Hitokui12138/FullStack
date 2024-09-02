package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;

/**
 * 这个类用于演示@Configuration的用法
 */
public class Camille implements ISkill {
    public Camille(){
        System.out.println("Camille instance is 实例化");
    }
    public void q(){
        System.out.println("Camille Q");
    }
    public void w(){
        System.out.println("Camille W");
    }
    public void e(){
        System.out.println("Camille E");
    }
    public void r(){
        System.out.println("Camille R");
    }
}
