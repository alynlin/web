package com.unique.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class RocketmqBrokerData implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 产品ID
     */
    private String productId;

    /**
     * 集群名称
     */
    private String clusterName;

    /**
     * 分片
     */
    private String brokerName;

    /**
     * broker编号
     */
    private Boolean brokerId;

    /**
     * broker地址
     */
    private String brokerAddr;

    /**
     * 生产消息TPS	
     */
    private String putTps;

    private String getTps;

    /**
     * 昨日生产总数
     */
    private String msgPutTotalYesterday;

    /**
     * 昨日消费总数
     */
    private String msgGetTotalYesterday;

    /**
     * 今天生产总数
     */
    private String msgPutTotalNow;

    /**
     * 今天消费总数
     */
    private String msgGetTotalNow;

    /**
     * 消息数据磁盘使用
     */
    private String commitLogdirCapacity;

    /**
     * 消息数据磁盘使用率
     */
    private String commitLogdiskRatio;

    private Date collectTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public Boolean getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Boolean brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerAddr() {
        return brokerAddr;
    }

    public void setBrokerAddr(String brokerAddr) {
        this.brokerAddr = brokerAddr;
    }

    public String getPutTps() {
        return putTps;
    }

    public void setPutTps(String putTps) {
        this.putTps = putTps;
    }

    public String getGetTps() {
        return getTps;
    }

    public void setGetTps(String getTps) {
        this.getTps = getTps;
    }

    public String getMsgPutTotalYesterday() {
        return msgPutTotalYesterday;
    }

    public void setMsgPutTotalYesterday(String msgPutTotalYesterday) {
        this.msgPutTotalYesterday = msgPutTotalYesterday;
    }

    public String getMsgGetTotalYesterday() {
        return msgGetTotalYesterday;
    }

    public void setMsgGetTotalYesterday(String msgGetTotalYesterday) {
        this.msgGetTotalYesterday = msgGetTotalYesterday;
    }

    public String getMsgPutTotalNow() {
        return msgPutTotalNow;
    }

    public void setMsgPutTotalNow(String msgPutTotalNow) {
        this.msgPutTotalNow = msgPutTotalNow;
    }

    public String getMsgGetTotalNow() {
        return msgGetTotalNow;
    }

    public void setMsgGetTotalNow(String msgGetTotalNow) {
        this.msgGetTotalNow = msgGetTotalNow;
    }

    public String getCommitLogdirCapacity() {
        return commitLogdirCapacity;
    }

    public void setCommitLogdirCapacity(String commitLogdirCapacity) {
        this.commitLogdirCapacity = commitLogdirCapacity;
    }

    public String getCommitLogdiskRatio() {
        return commitLogdiskRatio;
    }

    public void setCommitLogdiskRatio(String commitLogdiskRatio) {
        this.commitLogdiskRatio = commitLogdiskRatio;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}