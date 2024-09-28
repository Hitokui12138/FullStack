package com.lin.missyou.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Theme {
    @Id
    private Long id;

    @ManyToMany
    @JoinTable(name = "theme_spu",
            joinColumns = @JoinColumn(name = "theme_id"),
            inverseJoinColumns = @JoinColumn(name = "spu_id"))//指定第三张表表名
    private List<Spu> spuList;

    private String title;
    private String name;
}
