package com.lin.missyou.model.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Spu {
    @Id
    private Long id;

    @ManyToMany(mappedBy = "spuList")
    private List<Theme> themeList;

    private String title;
    private String subtitle;
}
