package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author:Evan
 * @Date:2018/8/1 $time$
 * @Describe：$describe$
 * @Return:$returns$
 * @Param:$params$
 */
@RestController
public class LoggerController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/log")
    public String sayHello(){
        logger.debug("Sample Debug Message");
        logger.info("logger 的提示信息");
        logger.warn("logger 的警告信息");
        logger.trace("Sample Trace Message");
        return "Hello,World!";
    }

}
