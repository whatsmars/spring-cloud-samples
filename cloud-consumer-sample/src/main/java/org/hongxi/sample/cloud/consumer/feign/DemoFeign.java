package org.hongxi.sample.cloud.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by shenhongxi on 2017/9/14.
 */
@FeignClient(value = "demo-provider")
public interface DemoFeign {
    @RequestMapping("/hello")
    String hello(@RequestParam(name = "name") String name); // 此处必须有RequestParam
}