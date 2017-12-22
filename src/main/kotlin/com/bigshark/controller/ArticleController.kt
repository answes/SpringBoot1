package com.bigshark.controller

import com.bigshark.service.impl.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

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
}