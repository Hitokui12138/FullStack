/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-02-24 17:30
 */
package com.lin.missyou.repository;

import com.lin.missyou.model.Spu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpuRepository extends JpaRepository<Spu, Long> {
    Spu findOneById(Long id);

    Page<Spu> findByCategoryIdOrderByCreateTimeDesc(Long cid, Pageable pageable);

    List<Spu> findByIdIn(List<Long> ids);

    Page<Spu> findByRootCategoryIdOrderByCreateTime(Long cid, Pageable pageable);

    Page<Spu> findByTitleLikeOrSubtitleLike(String keyword, String keyword1, Pageable pageable);
//    "select * from spu where category_id = cid"
//    "or and like order by >  <"
}
