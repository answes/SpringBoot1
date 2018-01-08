package com.bigshark.service.impl

import com.bigshark.bean.AClass
import com.bigshark.mapper.AClassMapper
import com.bigshark.service.IAClassService
import com.github.pagehelper.PageHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service
import java.util.*

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 14:41 2017/12/22
 * @Modificd :
 */
@Service
class AClassService: IAClassService {
    @Autowired
    lateinit var mapper: AClassMapper

    override fun create(aClass: AClass)=
        mapper.create(aClass)


    override fun delete(id: Long): Int = mapper.delete(id)

    override fun upDate(aClass: AClass): Int {
        return 1
    }

    override fun getById(id: Long): AClass = mapper.getById(id)

    override fun selectAll(param: Map<String, String>): List<AClass> {
        PageHelper.startPage<AClass>(param.get("page")!!.toInt(),param.get("rows")!!.toInt())
        return mapper.selectAll(param)
    }

}