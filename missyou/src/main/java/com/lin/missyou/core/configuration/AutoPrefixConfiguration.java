package com.lin.missyou.core.configuration;

import com.lin.missyou.core.hack.AutoPrefixUrlMapping;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * 这是AutoPrefix的配置类,需要实现WebMvcRegistrations
 * 打一个Component让Spring发现它
 */
@Component
public class AutoPrefixConfiguration implements WebMvcRegistrations {

    /**
     * AutoPrefix类继承于RequestMappingHandlerMapping,因此覆盖这个方法
     * @return
     */
    @Override
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        //return WebMvcRegistrations.super.getRequestMappingHandlerMapping();
        //直接实力化
        return new AutoPrefixUrlMapping();
    }
}
