package com.bigshark.utils

import javax.servlet.http.HttpServletRequest

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 15:19 2018/01/05
 * @Modificd :
 */
/**
 * 获取用户访问地址
 */
object IPUtil{
    fun getIp(request: HttpServletRequest):String{
        var ip = request.getHeader("x-forwarded-for")
        if(null == ip || ip.length==0 || "unknown".equals(ip)){
            ip = request.getHeader("Proxy-Client-IP")
        }
        if (ip == null || ip.length == 0 || "unknown".equals(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length == 0 || "unknown".equals(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip
    }
}