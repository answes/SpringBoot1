package com.bigshark.base

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 14:28 2018/01/08
 * @Modificd :
 */
interface BaseMapper<T> {
    fun create(t:T):Int
    fun byId(id:Int):T
    fun selectAll(param:Map<String,String>):List<T>
    fun update(t:T):Int
    fun delete(id:Int):Int
}