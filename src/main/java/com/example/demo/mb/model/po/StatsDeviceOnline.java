package com.example.demo.mb.model.po;

import java.util.Date;

public class StatsDeviceOnline extends StatsDeviceOnlineKey {
    private Long onlineSeconds;

    private Integer onlineStatus;

    private Integer onlineDays;

    private Integer offlineDays;

    private Date lastLoginTime;

    private Date lastLogoutTime;

    private Date lastUpdateTime;

    private Date createTime;

    public Long getOnlineSeconds() {
        return onlineSeconds;
    }

    public void setOnlineSeconds(Long onlineSeconds) {
        this.onlineSeconds = onlineSeconds;
    }

    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public Integer getOnlineDays() {
        return onlineDays;
    }

    public void setOnlineDays(Integer onlineDays) {
        this.onlineDays = onlineDays;
    }

    public Integer getOfflineDays() {
        return offlineDays;
    }

    public void setOfflineDays(Integer offlineDays) {
        this.offlineDays = offlineDays;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastLogoutTime() {
        return lastLogoutTime;
    }

    public void setLastLogoutTime(Date lastLogoutTime) {
        this.lastLogoutTime = lastLogoutTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}