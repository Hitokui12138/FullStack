/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-02-11 19:46
 */
package com.lin.missyou.model1;

import javax.persistence.*;
import java.util.List;

//去孤子
//@Entity
public class Theme {
    @Id
    private Long id;
    private String title;
    private String name;

//    @ManyToMany
//    @JoinTable(name = "theme_spu", joinColumns = @JoinColumn(name = "theme_id"),
//            inverseJoinColumns = @JoinColumn(name = "spu_id"))
    private List<Spu> spuList;
}
