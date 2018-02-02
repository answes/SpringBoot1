package com.bigshark.service

import com.bigshark.base.BaseIService
import com.bigshark.bean.Article

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 16:47 2017/12/22
 * @Modificd :
 */
interface IArticleService:BaseIService<Article> {
    fun getByParentId(parentId:Long):List<Article>
}