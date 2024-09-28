/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-02-08 05:31
 */
package com.lin.missyou.model1;

import javax.persistence.*;

//sql 2条sql语句 查询2次数据库
//sql 1次 join
//PHP 实体模型

//@Entity
public class BannerItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String img;
    private String keyword;
    private Short type;
    private String name;

    private Long bannerId;

//    @ManyToOne
//    @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT), insertable = false, updatable = false,name = "bannerId")
    private Banner banner;
}
