package com.bigshark.interceptor

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter


/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 15:08 2018/01/05
 * @Modificd :
 */
@Configuration
open class  MyWebMvcConfigurerAdapter: WebMvcConfigurerAdapter() {

    override fun addResourceHandlers(registry: ResourceHandlerRegistry?) {
        super.addResourceHandlers(registry)
    }

    //添加自己的拦截器
    override fun addInterceptors(registry: InterceptorRegistry?) {
        //这个是拦截所有的请求
        registry!!.addInterceptor(WebInterceptor()).addPathPatterns("/**")
    }
}