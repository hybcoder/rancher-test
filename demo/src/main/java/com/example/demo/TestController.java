package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangyanbo
 * @date 2019/5/9.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "rancher";
    }
}
