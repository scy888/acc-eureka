package com.weshare.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: scyang
 * @program: acc-eureka
 * @package: com.weshare.eureka
 * @date: 2021-04-27 01:48:44
 * @describe:
 */
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaApplication {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(EurekaApplication.class);
        long end = System.currentTimeMillis();
        log.info("EurekaApplicationf服务的启动耗时:{}毫秒", end - start);
    }
}
