package com.bigshark.service.impl

import com.bigshark.bean.User
import com.bigshark.mapper.UserMapper
import com.bigshark.service.IUserService
import com.github.pagehelper.PageHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 15:42 2018/01/08
 * @Modificd :
 */
@Service
class UserService : IUserService {

    @Autowired
    lateinit var userMapper:UserMapper

    override fun selectByName(name: String): User = userMapper.selectByName(name)

    override fun login(name: String, password: String): User {
        return userMapper.login(name,password)
    }

    override fun create(t: User): Int {
        return userMapper.create(t)
    }

    override fun selectAll(param: Map<String, String>): List<User> {
        PageHelper.startPage<User>(param.get("page")!!.toInt(),param.get("rows")!!.toInt())
        return userMapper.selectAll(param)
    }

    override fun byId(id: Int): User = userMapper.byId(id)

    override fun update(t: User): Int = userMapper.update(t)

    override fun delete(id: Int): Int = userMapper.delete(id)

}