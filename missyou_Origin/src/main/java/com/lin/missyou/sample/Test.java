/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-03-24 09:09
 */
package com.lin.missyou.sample;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Test {
    private String name = "7";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    private Test1 test1;

//    public Test(Test1 test1) {
//        this.test1 =test1;
//        System.out.println(test1);
//    }
}
