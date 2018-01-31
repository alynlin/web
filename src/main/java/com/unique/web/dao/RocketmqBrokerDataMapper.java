package com.unique.web.dao;


import com.unique.web.entity.RocketmqBrokerData;

public interface RocketmqBrokerDataMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RocketmqBrokerData record);

    int insertSelective(RocketmqBrokerData record);

    RocketmqBrokerData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RocketmqBrokerData record);

    int updateByPrimaryKey(RocketmqBrokerData record);
}