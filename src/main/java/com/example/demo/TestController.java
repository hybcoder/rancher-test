package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangyanbo
 * @date 2019/5/9.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${test.configmap:}")
    private String configmap;

    @RequestMapping("/index")
    public String index() {
        return "hello rancher";
    }

    @RequestMapping("/configmap")
    public String configmap() {
        return configmap;
    }
}
