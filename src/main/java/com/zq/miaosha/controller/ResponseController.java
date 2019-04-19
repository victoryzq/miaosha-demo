package com.zq.miaosha.controller;

import com.zq.miaosha.entity.CodeMsg;
import com.zq.miaosha.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class ResponseController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello word !";
    }


    @RequestMapping("/success")
    public Result success(){
        return Result.success("hello word!");
    }

    @RequestMapping("/error")
    public Result error(){
        return Result.error(CodeMsg.SERVER_ERROR);
    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","Java");
        return "hello";
    }
}
