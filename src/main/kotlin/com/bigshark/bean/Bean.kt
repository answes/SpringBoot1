package com.bigshark.bean

import java.util.*

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 13:32 2017/12/22
 * @Modificd :
 */

data class User(var id:Int =0 ,var name:String,var password:String)

data class Article(var id:Int = 0,var parentId:Int=0,var title:String,var author:String,var content:String,var createTime:Date,var updateTime:Date?)

data class AClass(var id:Int=0,var title:String="",var info:String="",var createTime:Date?=null,var updateTime:Date?=null)