package org.hongxi.sample.cloud.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 * Created by shenhongxi on 2021/4/11.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Autowired
    Environment env;

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {
            System.out.println(
                    "book.categoty=" + env.getProperty("book.category", "unknown")
            );
            System.out.println(
                    "book.author=" + env.getProperty("book.author", "unknown")
            );
            System.out.println(
                    "book.name=" + env.getProperty("book.name", "unknown")
            );
        };
    }
}
