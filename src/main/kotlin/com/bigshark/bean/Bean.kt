package com.bigshark.bean

import java.util.*

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 13:32 2017/12/22
 * @Modificd :
 */


data class Article(var id:Long = 0,
                   var parentId:Long=0,
                   var title:String="",
                   var author:String="",
                   var content:String="",
                   var info:String="",
                   var createTime:Date?=null,
                   var updateTime:Date?=null)

data class AClass(var id:Int=0,
                  var title:String="",
                  var info:String="",
                  var createTime:Date?=null,
                  var updateTime:Date?=null)

data class User(var id:Int=0,
                var userName:String="",
                var img:String="",
                var password:String="",
                var ip:String="",
                var login:String="",
                var createTIme:Date?=null,
                var updateTime:Date?=null)