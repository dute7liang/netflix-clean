package com.dute7liang.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>created on 2020-8-5</p>
 *
 * @author dute7liang
 */
@FeignClient(value = "provide")
@RequestMapping(value = "/demo")
public interface ProviderFeignClient {

    @RequestMapping(method = RequestMethod.GET,value = "/message")
    String message(@RequestParam(value = "a",required = false) String a);

}
