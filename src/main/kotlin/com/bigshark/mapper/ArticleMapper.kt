package com.bigshark.mapper

import com.bigshark.bean.Article
import org.apache.ibatis.annotations.Param
import org.springframework.stereotype.Component

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 16:42 2017/12/22
 * @Modificd :
 */
@Component
interface ArticleMapper {
    fun create(article:Article):Int
    fun upData(article:Article):Int
    fun getById(id:Long):Article
    fun selectAll(@Param("param")param:Map<String,Any>):List<Article>
    fun delete(id:Long):Int
    fun getByParentId(parentId:Long):List<Article>
}