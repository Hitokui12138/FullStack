package com.lin.missyou.core.hack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

public class AutoPrefixUrlMapping extends RequestMappingHandlerMapping {

    @Value("${missyou.api-package}")
    private String apiPackagePath;

    /**
     * RequestMappingHandlerMapping的方法
     * @param method
     * @param handlerType
     * @return
     */
    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
        RequestMappingInfo mappingInfo =  super.getMappingForMethod(method, handlerType);

        if(mappingInfo != null){
            String prefix = this.getPrefix(handlerType);//“/v1”
            //使用Requestmapping下面的一个静态方法来合并URL
            return RequestMappingInfo
                    .paths(prefix).build()    //生成一个新的MappingInfo,但现在只有“/v1”
                    .combine(mappingInfo); //合并之前的“banner/test”
        }
        return mappingInfo;
    }

    /**
     * 修改前缀
     * @param handlerType
     * @return
     */
    private String getPrefix(Class<?> handlerType){
        //前缀在BannerController的目录结构里面
        String packageName = handlerType.getPackageName();//com.lin.missyou.api.v1
        String dotPath = packageName.replaceAll(this.apiPackagePath, "");
        return dotPath.replace(".","/");//获得“/v1”
    }
}
