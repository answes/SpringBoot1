package com.bigshark.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 11:28 2017/12/22
 * @Modificd :
 */
@Controller
@RequestMapping("/")
class SampleController{

    @RequestMapping("/templates")
    fun home():ModelAndView{
        val model =ModelAndView("/index")
        return model
    }

}