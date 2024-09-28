package com.lin.missyou.repository;

import com.lin.missyou.model1.jpa.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA有8种查询
 */
public interface BannerRepository extends JpaRepository<Banner, Long> {
    Banner findOneById(Long i);
    Banner findOneByName(String name);
}
