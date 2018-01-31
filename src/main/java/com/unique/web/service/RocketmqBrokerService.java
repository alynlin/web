package com.unique.web.service;

import com.unique.web.dao.RocketmqBrokerDataMapper;
import com.unique.web.entity.RocketmqBrokerData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RocketmqBrokerService {

    @Resource
    RocketmqBrokerDataMapper rocketmqBrokerDataMapper;

    public RocketmqBrokerData query(int id) {

        return rocketmqBrokerDataMapper.selectByPrimaryKey(id);
    }

}
