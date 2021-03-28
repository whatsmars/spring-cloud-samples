package org.hongxi.sample.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * Created by shenhongxi on 2017/9/14.
 */
@RestController
public class DemoController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/hi")
    public Mono<String> hi(String name) {
        return webClientBuilder
                .baseUrl("http://demo-provider")
                .build()
                .get()
                .uri("/hello?name={name}", name)
                .retrieve()
                .bodyToMono(String.class);
    }
}