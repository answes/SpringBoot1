package com.bigshark.utils

import java.io.File

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 11:10 2018/01/08
 * @Modificd :
 */
object LoggerFile{

    val fileParentPath = "D:\\fileLogger"
    val file:File = File(fileParentPath)

    fun loginLog(content:String){
        val name:String = "loginLog.txt"
        if(file.exists()){
            file.createNewFile()
        }
        var loginFile:File = File(fileParentPath+name)
    }
}