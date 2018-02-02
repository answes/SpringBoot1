package com.bigshark.service

import com.bigshark.base.BaseIService
import com.bigshark.bean.User

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 15:41 2018/01/08
 * @Modificd :
 */
interface IUserService:BaseIService<User> {
    fun selectByName(name:String): User
    fun login(name:String,password:String): User
}