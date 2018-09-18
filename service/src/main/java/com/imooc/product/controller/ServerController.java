package com.imooc.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/3:19:22
 */
@RestController
public class ServerController {

    @RequestMapping("/msg")
    public String msg(){
        return "this is product msg";
    }
}