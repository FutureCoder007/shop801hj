package com.qf.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * Created by Administrator on 2018/5/22.
 */
@Controller

public class UserController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
