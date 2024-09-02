package com.lin.missyou.model;

import javax.persistence.*;

@Entity
public class BannerItem {
    @Id
    private long id;

    private long bannerId;
    private String img;
    private String keyword; //应该跳转到哪个spu的页面,这个可以保存spuid或者themeid
    private short type; //点击banner后跳到spu详情页面还是其他什么页面
    private String name;
}
