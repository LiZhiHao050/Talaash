package com.talaash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LZH
 * @date 2020/3/24
 * Describe: 管理员消费者
 */

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class AdminConsumer {

    public static void main(String[] args) {
        SpringApplication.run(AdminConsumer.class, args);
    }

}
