/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-02-17 17:50
 */
package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
//where delete_time == null
@Where(clause = "delete_time is null ")
public class Banner extends BaseEntity {
    @Id //1. 主键
    private Long id;    //2. 数据库的int->java里的Long
    //private Date createTime;  //3. 默认时TimeStamp,这里改成常用的Date
    private String name;
    private String description;
    private String title;
    private String img;
    //4. 导航属性
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="bannerId")
    private List<BannerItem> items;
}
