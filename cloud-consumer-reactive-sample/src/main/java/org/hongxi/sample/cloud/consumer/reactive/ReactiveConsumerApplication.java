package org.hongxi.sample.cloud.consumer.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Created by shenhongxi on 2017/9/14.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ReactiveConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactiveConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

    @Bean
    public WebClient webClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder
                .baseUrl("http://demo-provider-reactive")
                .build();
    }
}
