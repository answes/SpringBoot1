package com.bigshark.service.impl

import com.bigshark.bean.AClass
import com.bigshark.service.IAClassService
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service
import java.util.*

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 16:47 2017/12/22
 * @Modificd :
 */
@Service
class ArticleService :IAClassService{
    override fun create(aClass: AClass): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: Long): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun upDate(aClass: AClass): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getById(id: Long): AClass {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun selectAll(page: Page<AClass>, param: Map<String, Objects>): List<AClass> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}