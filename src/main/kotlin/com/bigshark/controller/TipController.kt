package com.bigshark.controller

import com.bigshark.service.impl.TipService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Author : bigshark
 * @Descripstion :
 * @Date : Create in 11:22 2018/02/02
 * @Modificd :
 */

@RestController()
@RequestMapping("tip")
class TipController{

    @Autowired
    var tipService = TipService()




}