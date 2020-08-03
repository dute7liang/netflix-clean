package com.dute7liang.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>created on 2020-8-3</p>
 *
 * @author dute7liang
 */
@SpringBootApplication
@EnableEurekaClient
public class ProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class,args);
    }


    /*@Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }*/


}
