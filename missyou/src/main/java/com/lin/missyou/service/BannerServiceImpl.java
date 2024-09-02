package com.lin.missyou.service;

import com.lin.missyou.model.Banner;
import com.lin.missyou.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * service层用来编写业务逻辑
 */
@Service
public class BannerServiceImpl implements BannerService {
    //注入BannerRepository
    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public Banner getByName(String name) {
        return bannerRepository.findOneByName(name);
    }
}
