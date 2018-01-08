package com.bigshark.base

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 14:39 2018/01/08
 * @Modificd :
 */
interface BaseIService<T>{
    fun create(t:T):Int
    fun selectAll(param:Map<String,String>):List<T>
    fun byId(id:Int):T
    fun update(t:T):Int
}