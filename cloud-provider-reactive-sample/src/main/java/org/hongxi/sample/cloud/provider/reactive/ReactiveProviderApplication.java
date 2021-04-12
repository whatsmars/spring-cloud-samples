package org.hongxi.sample.cloud.provider.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by shenhongxi on 2017/9/14.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ReactiveProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactiveProviderApplication.class, args);
    }
}