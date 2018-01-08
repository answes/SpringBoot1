package com.bigshark.service

import com.bigshark.bean.AClass
import org.springframework.data.domain.Page
import java.util.*

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 14:40 2017/12/22
 * @Modificd :
 */
interface IAClassService {
    fun create(aClass: AClass):Int
    fun delete(id:Long):Int
    fun upDate(aClass: AClass):Int
    fun getById(id:Long): AClass
    fun selectAll(param:Map<String, String>):List<AClass>
}