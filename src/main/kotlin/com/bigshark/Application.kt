package com.bigshark

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 11:21 2017/12/22
 * @Modificd :
 */
@SpringBootApplication
@MapperScan("com.bigshark")
@ComponentScan("com.bigshark")
open class Application

fun main(args:Array<String>){
SpringApplication.run(Application::class.java,*args)
}