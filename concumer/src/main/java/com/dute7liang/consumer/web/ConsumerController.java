package com.dute7liang.consumer.web;

import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>created on 2020-8-3</p>
 *
 * @author dute7liang
 */
@RestController
@RequestMapping("consumer")
@Slf4j
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("message")
    public String message(){
        String aaaaa = restTemplate.getForObject("http://provide/demo/message?a=dsadaf", String.class);
        return "我调用了consumer,"+aaaaa;
    }


}
