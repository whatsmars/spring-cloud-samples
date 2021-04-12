package org.hongxi.sample.cloud.provider.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shenhongxi on 2017/9/14.
 */
@RestController
public class DemoService {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(String name) {
        return "Hi, " + name + ", Here is " + port;
    }
}