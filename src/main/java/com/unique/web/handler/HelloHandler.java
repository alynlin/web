package com.unique.web.handler;

import com.unique.web.entity.RocketmqBrokerData;
import com.unique.web.service.RocketmqBrokerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @Resource
    RocketmqBrokerService rocketmqBrokerService;

    @RequestMapping("/say")
    @ResponseBody
    public RocketmqBrokerData say() {
        return rocketmqBrokerService.query(2257);
    }

}
