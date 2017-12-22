package com.bigshark.mapper

import com.bigshark.bean.Article

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 16:42 2017/12/22
 * @Modificd :
 */
interface ArticleMapper {
    fun create(article:Article):Int
    fun upData(article:Article):Int
    fun getById(id:Long):Article
    fun selectAll():List<Article>
    fun delete(id:Long):Int
    fun getByParentId(parentId:Long):List<Article>
}