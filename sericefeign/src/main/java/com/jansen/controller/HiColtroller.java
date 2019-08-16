package com.jansen.controller;

import com.jansen.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("all")
@RestController
public class HiColtroller {

    @Autowired
    SchedualService schedualServiceHi;

    /**
     * 在Web层的controller层，对外暴露一个"/hi"的API接口，通过上面定义的Feign客户端SchedualServiceHi 来消费服务
     */
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "jansen") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
