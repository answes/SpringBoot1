package com.bigshark.service

import com.bigshark.bean.Article

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 16:47 2017/12/22
 * @Modificd :
 */
interface IArticleService {
    fun create(article: Article):Int
    fun upData(article: Article):Int
    fun getById(id:Long): Article
    fun selectAll(param:Map<String,String>):List<Article>
    fun delete(id:Long):Int
    fun getByParentId(parentId:Long):List<Article>
}