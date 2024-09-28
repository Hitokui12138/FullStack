/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-12-28 08:52
 */
package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;


public class Camille implements ISkill {
    private String skillName = "Camille R";

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;
    private Integer age;


    public Camille(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Camille() {
        System.out.println("Hello,7yue");
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
        System.out.println(this.skillName);
    }
}
