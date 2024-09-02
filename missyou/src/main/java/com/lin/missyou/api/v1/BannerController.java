package com.lin.missyou.api.v1;

import com.lin.missyou.dto.PersonDTO;
import com.lin.missyou.exception.http.ForbiddenException;
import com.lin.missyou.model.Banner;
import com.lin.missyou.sample.IConnect;
import com.lin.missyou.sample.ISkill;
import com.lin.missyou.service.BannerServiceImpl;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 *
 */
@RestController
//@RequestMapping("/v1/banner") AutoPrefix实现了路径转URL
@RequestMapping("/banner")
@Validated//让@Max等等注解生效
public class BannerController {
    //属性注入(不推荐)
    @Autowired
    //@Qualifier("irelia")
    private ISkill iSkill;
    @Autowired
    private IConnect iConnect;

    //业务
    @Autowired
    private BannerServiceImpl bannerServiceImpl;


    /**
     * 1.通过Name获取Banner
     */
    @GetMapping("/name/{name}")
    public Banner getByName(@PathVariable String name){
        /**
         * 根据name查询数据库,但controller不应该操作数据库
         */
        Banner banner = bannerServiceImpl.getByName(name);
        return banner;
    }



    /**
     * 以下是测试用接口
     * http://localhost:8080/v1/banner/test
     * @return
     */
    @GetMapping("/test")
    public String test() throws Exception {
        iSkill.r();
        iConnect.connect();
        //throw new RuntimeException("这里错了");
        throw new ForbiddenException(10001);
        //return "Hello,test";
    }

    /**
     * http://localhost:8080/v1/banner/test2
     * 测试参数传递
     * @return
     */
    @PostMapping("/test2/{id}")
    public PersonDTO test2(@PathVariable(name="id") @Range(min=10,max=20,message="ID范围错误") Integer num,
                        @RequestParam @Length(min=10) String name,
                        @RequestBody @Validated PersonDTO person){
        PersonDTO dto = PersonDTO.builder().name("7yue").age(20).build();
        iSkill.r();
        return dto;
        //throw new ForbiddenException(10001);
    }


}
