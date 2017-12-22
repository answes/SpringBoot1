package com.bigshark.mapper

import com.bigshark.bean.AClass
import org.springframework.data.domain.Page
import org.springframework.stereotype.Component
import java.util.*

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 14:00 2017/12/22
 * @Modificd :
 */
@Component
interface AClassMapper {
    fun create(aClass:AClass):Int
    fun delete(id:Long):Int
    fun upDate(aClass:AClass):Int
    fun getById(id:Long):AClass
    fun selectAll(page:Page<AClass>,param:Map<String,Objects>):List<AClass>
    fun total():Long
}