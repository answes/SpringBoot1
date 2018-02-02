package com.bigshark.mapper

import com.bigshark.base.BaseMapper
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
interface ArticleMapper:BaseMapper<Article> {
    fun getByParentId(parentId:Long):List<Article>
}