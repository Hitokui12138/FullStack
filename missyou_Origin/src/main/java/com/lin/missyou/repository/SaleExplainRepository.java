/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-08-17 04:55
 */
package com.lin.missyou.repository;

import com.lin.missyou.model.SaleExplain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleExplainRepository extends JpaRepository<SaleExplain, Long> {
    List<SaleExplain> findByFixedOrderByIndex(Boolean fixed);
}