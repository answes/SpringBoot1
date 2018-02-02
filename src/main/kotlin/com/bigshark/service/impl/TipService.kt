package com.bigshark.service.impl

import com.bigshark.bean.Tip
import com.bigshark.service.ITipService
import org.springframework.stereotype.Service

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 11:20 2018/02/02
 * @Modificd :
 */
@Service
class TipService:ITipService{
    override fun create(t: Tip): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun selectAll(param: Map<String, String>): List<Tip> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun byId(id: Int): Tip {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(t: Tip): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: Int): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}