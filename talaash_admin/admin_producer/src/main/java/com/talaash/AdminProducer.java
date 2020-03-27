package com.talaash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LZH
 * @date 2020/3/23
 * Describe: 管理员服务端
 */

@EnableDiscoveryClient
@SpringBootApplication
public class AdminProducer {

    public static void main(String[] args) {
        SpringApplication.run(AdminProducer.class, args);
    }

}
