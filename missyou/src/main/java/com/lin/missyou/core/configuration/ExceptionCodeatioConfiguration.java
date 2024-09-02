package com.lin.missyou.core.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 不要把所有配置都写进application里,这里新建一个配置文件
 * 用这一个类去对应resources/config/exception-code的一个个配置
 * 使用Map来对应里面的配置
 * 使用@PropertySource指定这个路径,注意格式
 *
 * lin.codes的codes会自动与定义好的codes对应上
 * 这里使用@ConfigurationProperties来指定这个前缀
 *
 * 最后这个类不在容器里面,因此加上@Component
 */

@PropertySource(value = "classpath:config/exception-code.properties")
@ConfigurationProperties(prefix = "lin")
@Component
public class ExceptionCodeatioConfiguration {
    private Map<Integer, String> codes = new HashMap<>();

    //通过Code拿到异常信息
    public String getMessage(int code){
        String message = codes.get(code);
        return message;
    }

    //getter,setter
    public Map<Integer, String> getCodes() {
        return codes;
    }
    public void setCodes(Map<Integer, String> codes) {
        this.codes = codes;
    }
}
