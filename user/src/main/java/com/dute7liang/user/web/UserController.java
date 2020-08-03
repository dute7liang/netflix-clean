package com.dute7liang.user.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>created on 2020-8-3</p>
 *
 * @author dute7liang
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @GetMapping("info")
    public String message(String a){
        log.info("用户接口被调用了！用户名:"+a);
        return a;
    }
}
