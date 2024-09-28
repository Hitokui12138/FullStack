/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-09-07 00:25
 */
package com.lin.missyou.service;

import com.lin.missyou.model.Spu;
import com.lin.missyou.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private SpuRepository spuRepository;

    public Page<Spu> search(String q, Integer page, Integer count) {
        Pageable paging = PageRequest.of(page, count);
        String likeQ = "%" +q + "%";
        return spuRepository.findByTitleLikeOrSubtitleLike(likeQ,likeQ, paging);
    }
}
