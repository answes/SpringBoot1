package com.bigshark.controller

import com.bigshark.bean.AClass
import com.bigshark.bean.ReslutMap
import com.bigshark.service.impl.AClassService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.util.*
import kotlin.collections.HashMap

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 14:55 2017/12/22
 * @Modificd :
 */
@Controller
@RequestMapping("/class")
class AClassController {
    @Autowired
    val aclassService = AClassService()

    @RequestMapping("/create")
    @ResponseBody
    fun create(title:String,info:String): ReslutMap {
        val aClass = AClass(0,title,info, Date(),null)
        aclassService.create(aClass)
        return ReslutMap()
    }
    @RequestMapping("/getById")
    @ResponseBody
    fun getById(id:Int):AClass = aclassService.byId(id)

    @RequestMapping("/selectList")
    @ResponseBody
    fun selectList():ReslutMap{
        val param = HashMap<String,String>()
        param.put("page","1")
        param.put("rows","10")
        val list = aclassService.selectAll(param)
        return ReslutMap(0,list,"seccuss")
    }
}