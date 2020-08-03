package com.dute7liang.eureka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>created on 2020-8-3</p>
 *
 * @author dute7liang
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

    private static final Logger log = LoggerFactory.getLogger(EurekaServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class,args);
        log.info("eureka service started");
    }

}
