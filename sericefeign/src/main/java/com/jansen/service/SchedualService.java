package com.jansen.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * value  注解指定服务
 * fallback 指定熔断器
 */
@FeignClient(value="service-jansen",fallback = SchedualServiceHiHystric.class)
public interface SchedualService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
