package com.bigshark.interceptor

import com.bigshark.utils.IPUtil
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import java.lang.Exception
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 15:05 2018/01/05
 * @Modificd :
 */
/**
 * 拦截器
 */
class WebInterceptor : HandlerInterceptor {
    override fun preHandle(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?): Boolean {
        val ip = IPUtil.getIp(request!!)
        if(ip =="192.168.0.129"){
            return true;
        }
        return true;
    }

    override fun postHandle(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?, modelAndView: ModelAndView?) {
    }

    override fun afterCompletion(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?, ex: Exception?) {
    }
}