package com.dute7liang.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * <p>created on 2020-8-3</p>
 *
 * @author dute7liang
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class,args);
    }


}
