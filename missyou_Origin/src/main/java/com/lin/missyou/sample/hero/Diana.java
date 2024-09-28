/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-12-26 10:33
 */
package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;
import com.lin.missyou.sample.database.MySQL;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class Diana implements ISkill {
    private String skillName = "Diana R";
    private String name;
    private Integer age;

    public Diana(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Diana() {
        System.out.println("Hello,7yue");
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
        System.out.println(this.skillName);
    }
}
