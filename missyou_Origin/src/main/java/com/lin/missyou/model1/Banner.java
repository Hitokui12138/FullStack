/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-02-03 21:07
 */
package com.lin.missyou.model1;


import javax.persistence.*;
import java.util.List;

//orm
//物理外键 逻辑外键 实体与实体关系配置 单表查询

//@Entity
@Table(name="banner")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 16)
    private String name;

    @Transient
    private String description;
    private String img;
    private String title;

//    @OneToMany(mappedBy = "banner", fetch = FetchType.EAGER)
//    @org.hibernate.annotations.ForeignKey(name="null")
//    @JoinColumn(name="bannerId")
    private List<BannerItem> items;
}
