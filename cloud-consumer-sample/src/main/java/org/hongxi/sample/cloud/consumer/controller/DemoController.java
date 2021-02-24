package org.hongxi.sample.cloud.consumer.controller;

import org.hongxi.sample.cloud.consumer.feign.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shenhongxi on 2017/9/14.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoFeign demoFeign;

    @RequestMapping("/hi")
    public String hi(String name) {
        return demoFeign.hello(name);
    }
}