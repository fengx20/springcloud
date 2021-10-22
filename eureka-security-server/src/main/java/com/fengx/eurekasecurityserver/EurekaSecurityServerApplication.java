package com.fengx.eurekasecurityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Fengx
 * 启用Euerka注册中心功能
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaSecurityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSecurityServerApplication.class, args);
    }

}
