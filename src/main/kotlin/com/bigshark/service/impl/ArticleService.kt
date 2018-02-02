package com.bigshark.service.impl

import com.bigshark.bean.Article
import com.bigshark.mapper.ArticleMapper
import com.bigshark.service.IArticleService
import com.github.pagehelper.PageHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 16:47 2017/12/22
 * @Modificd :
 */
@Service
class ArticleService :IArticleService{

    @Autowired
    lateinit var mapper:ArticleMapper

    override fun create(article: Article)= mapper.create(article)

    override fun byId(id: Int): Article =mapper.byId(id)

    override fun update(t: Article): Int =mapper.update(t)

    override fun delete(id: Int): Int =mapper.delete(id)

    override fun selectAll(param:Map<String,String>):List<Article>{
        PageHelper.startPage<Int>(param.get("page")!!.toInt(),param.get("rows")!!.toInt())
        return  mapper.selectAll(param)
    }

    override fun getByParentId(parentId: Long)=mapper.getByParentId(parentId)
}