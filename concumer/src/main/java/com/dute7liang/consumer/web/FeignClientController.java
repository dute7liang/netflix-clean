package com.dute7liang.consumer.web;

import com.dute7liang.consumer.feign.ProviderFeignClient;
import com.dute7liang.consumer.feign.UserFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>created on 2020-8-5</p>
 *
 * @author dute7liang
 */
@RequestMapping("feign")
@RestController
public class FeignClientController {

    @Autowired
    private UserFeignClient userFeignClient;

    @Autowired
    private ProviderFeignClient providerFeignClient;


    @GetMapping("message")
    @HystrixCommand(fallbackMethod = "callBack")
    public String message(){
        String aaaaa = providerFeignClient.message("dasjdad");
        return "我调用了consumer,"+aaaaa;
    }

    public String callBack(){
        return "服务降级了！！";
    }

    @GetMapping("user")
    public String user(){
        String aaaaa = userFeignClient.message("dasjdad");
        return "我调用了consumer,"+aaaaa;
    }

}
