package com.lin.missyou.model1.jpa;

import javax.persistence.*;
import java.util.List;

/**
 * 一个类就看做是数据库的一张表
 * @Entity注解是JPA提供的
 */

@Entity
//@Table(name = "banner1") 改名
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增长
    private long id;
    //一组bannerItem,使用注解来使两个表产生联系

    //@OneToMany(fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "banner")  //默认是懒加载
    //@JoinColumn(name = "bannerId")
    //@org.hibernate.annotations.ForeignKey(name = "null")
    private List<BannerItem> items;

    @Column(length = 16)//用的多,各种参数
    private String name;
    @Transient//这个属性仅Class使用,不映射到数据库表
    private String description;
    private String img;//不推荐把二进制文件保存成String,这里仅表示地址
    private String title;

}
