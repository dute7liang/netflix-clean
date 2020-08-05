package com.dute7liang.consumer.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>created on 2020-8-3</p>
 *
 * @author dute7liang
 */
@RestController
@RequestMapping("rest")
@Slf4j
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("message")
    public String message(){
        String aaaaa = restTemplate.getForObject("http://provide/demo/message?a=dsadaf", String.class);
        return "我调用了consumer,"+aaaaa;
    }

    @GetMapping("user")
    public String user(){
        String aaaaa = restTemplate.getForObject("http://user/user/info", String.class);
        return "我调用了consumer,"+aaaaa;
    }


}
