package com.lin.missyou.sample;

import com.lin.missyou.sample.database.MySQL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 在方法里给mysql的实例的属性赋予初期值
 * 读取配置文件的方法 @Value
 */
@Configuration
public class DatabaseConfiguration {
    //读取配置文件的方法
    @Value("${mysql.ip}")
    private String ip;
    @Value("${mysql.port}")
    private Integer port;

    @Bean
    public IConnect mysql(){
        return new MySQL(this.ip,this.port);
    }
}
