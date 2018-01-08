package com.bigshark.mapper

import com.bigshark.base.BaseMapper
import com.bigshark.bean.User
import org.springframework.stereotype.Component

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 14:24 2018/01/08
 * @Modificd :
 */
@Component
interface UserMapper: BaseMapper<User> {
    fun selectByName(name:String):User
    fun login(name:String,password:String):User
}