package com.bigshark.controller

import com.bigshark.bean.Article
import com.bigshark.bean.ReslutMap
import com.bigshark.service.impl.ArticleService
import com.github.pagehelper.PageInfo
import org.apache.ibatis.annotations.Param
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.util.*
import kotlin.collections.HashMap

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 16:48 2017/12/22
 * @Modificd :
 */
@Controller
@RequestMapping("/article")
class ArticleController {

    @Autowired
    var articleService =ArticleService()


    @RequestMapping("/createArticle")
    @ResponseBody
    fun create(parentId:Long,title:String,author:String,content:String,info:String):Int
            = articleService.create(Article(0,parentId,title,author,content,info,null,null))

    @RequestMapping("/getAll")
    @ResponseBody
    fun selectAll(page:Long,parentId: Long):ReslutMap{
        val param = HashMap<String,String>()
        param.put("parentId",parentId.toString())
        param.put("page",page.toString())
        param.put("rows",20.toString())
        val list:List<Article> = articleService.selectAll(param)
        val pages:PageInfo<Article> = PageInfo<Article>(list)
        return ReslutMap(0,pages,"success");
    }

    @RequestMapping("/upDateArticle")
    @ResponseBody
    fun upDateArticle(parentId:Long,title:String,author:String,content:String,info:String):Int
            = articleService.upData(Article(0,parentId,title,author,content,info,null,Date()))

    @RequestMapping("/deleteArticle")
    @ResponseBody
    fun delete(id:Long):ReslutMap{
        val i = articleService.delete(id)
        if (i > 1){
            return ReslutMap(0,null,"success")
        }
        return ReslutMap(1,null,"error")
    }
}