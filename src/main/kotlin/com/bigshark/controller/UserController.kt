package com.bigshark.controller

import com.bigshark.bean.ReslutMap
import com.bigshark.bean.User
import com.bigshark.service.impl.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 16:18 2018/01/08
 * @Modificd :
 */
@RestController
@RequestMapping("/user")
class UserController {
    @Autowired
    val userService = UserService()

    @PostMapping("/login")
    fun login(name:String,password:String):ReslutMap{

        val user:User? = userService.login(name,password)

        if(null != user){
            return ReslutMap(0, user)
        }
        return ReslutMap(1, null,"用户不存在")
    }

    @PostMapping("/selectAll")
    fun selectAll(param:Map<String,String>):ReslutMap{
        return ReslutMap(0,userService.selectAll(param))
    }
}