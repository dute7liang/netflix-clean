package com.dute7liang.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>created on 2020-8-5</p>
 *
 * @author dute7liang
 */
@FeignClient(value = "user")
@RequestMapping("user")
public interface UserFeignClient {

    @GetMapping("info")
    String message(String a);
}
