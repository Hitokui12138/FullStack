/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020-03-05 02:09
 */
package com.lin.missyou.api.v1;

import com.lin.missyou.model.Sku;
import com.lin.missyou.model.Spu;
import com.lin.missyou.service.SkuService;
import com.lin.missyou.service.SpuService;
import com.lin.missyou.vo.SkuIsTestVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("sku")
@RestController
public class SkuController {
    @Autowired
    private SkuService skuService;

    @Autowired
    private SpuService spuService;

    @GetMapping("")
    public List<Sku> getSkuListInIds(@RequestParam(name = "ids", required = false) String ids) {
        if(ids==null || ids.isEmpty()){
            return Collections.emptyList();
        }
        List<Long> idList = Arrays.stream(ids.split(","))
                .map(s -> Long.parseLong(s.trim()))
                .collect(Collectors.toList());
        List<Sku> skus = skuService.getSkuListByIds(idList);
//        List<Long> spuIds = new ArrayList<>();
//        skus.forEach(sku-> spuIds.add(sku.getSpuId()));
//        List<Spu> spuList = spuService.getSpuListInIds(spuIds);
//        List<SkuIsTestVO> vos = new ArrayList<>();
//
//        skus.forEach(sku -> {
//            SkuIsTestVO vo = new SkuIsTestVO(sku, spuList);
//            vos.add(vo);
//        });
        return skus;
    }
}
