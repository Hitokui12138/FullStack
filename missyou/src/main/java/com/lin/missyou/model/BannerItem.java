package com.lin.missyou.model;

import javax.persistence.*;

@Entity
public class BannerItem {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "bannerId",
                foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Banner banner;

    //如果是双向关系的话,bannerId会自动生成banner_id,单向时保留
    //private long bannerId;
    private String img;
    private String keyword; //应该跳转到哪个spu的页面,这个可以保存spuid或者themeid
    private short type; //点击banner后跳到spu详情页面还是其他什么页面
    private String name;
}
