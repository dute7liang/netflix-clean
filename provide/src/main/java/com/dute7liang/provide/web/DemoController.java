package com.dute7liang.provide.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>created on 2020-8-3</p>
 *
 * @author dute7liang
 */
@RequestMapping("demo")
@RestController
@Slf4j
public class DemoController {

    @GetMapping("message")
    public String message(String a){
        log.info("我被调用了！a="+a);
        return a;
    }

}
