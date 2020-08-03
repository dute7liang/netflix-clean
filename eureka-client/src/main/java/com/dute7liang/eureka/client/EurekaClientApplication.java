package com.dute7liang.eureka.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>created on 2020-8-3</p>
 *
 * @author dute7liang
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {

    private static final Logger log = LoggerFactory.getLogger(EurekaClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class,args);
        log.info("eureka client started");
    }

}
