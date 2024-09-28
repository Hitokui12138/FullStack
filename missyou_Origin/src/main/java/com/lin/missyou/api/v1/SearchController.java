/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://talelin.com
 * @免费专栏 $ http://course.talelin.com
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-09-07 00:20
 */
package com.lin.missyou.api.v1;

import com.lin.missyou.bo.PageCounter;
import com.lin.missyou.model.Spu;
import com.lin.missyou.service.SearchService;
import com.lin.missyou.util.CommonUtil;
import com.lin.missyou.vo.PagingDozer;
import com.lin.missyou.vo.SpuSimplifyVO;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RequestMapping("search")
@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;
    @GetMapping("")
    public PagingDozer<Spu, SpuSimplifyVO> search(@RequestParam String q,
                                                  @RequestParam(defaultValue = "0") Integer start,
                                                  @RequestParam(defaultValue = "10") Integer count) {
        PageCounter counter = CommonUtil.convertToPageParameter(start, count);
        Page<Spu> page = this.searchService.search(q, counter.getPage(), counter.getCount());
//        if (page.getContent().isEmpty()) {
//            return
//        }
        return new PagingDozer<>(page, SpuSimplifyVO.class);
    }
}