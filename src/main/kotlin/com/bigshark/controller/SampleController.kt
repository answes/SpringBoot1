package com.bigshark.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 11:28 2017/12/22
 * @Modificd :
 */
@Controller
class SampleController{

    @RequestMapping("/") //映射最基础的URL
    @ResponseBody        //表明这是一个Resopnse，而不是一个视图名称
    internal fun home(): String {
        return "Hello World!" //为请求返回一个字符串。
    }

}