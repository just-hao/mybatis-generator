package com.wh.model;

import java.util.Date;

public class TImRedisinfo {
    private Long id;

    private Date createtime;

    private Date recordtime;

    private String servicename;

    private String serviceip;

    private Long usedmemory;

    private Long usedmemoryrss;

    private Long usedmemorypeak;

    private Long totalsystemmemory;

    private Long usedmemorylua;

    private Float memfragmentationratio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getServiceip() {
        return serviceip;
    }

    public void setServiceip(String serviceip) {
        this.serviceip = serviceip;
    }

    public Long getUsedmemory() {
        return usedmemory;
    }

    public void setUsedmemory(Long usedmemory) {
        this.usedmemory = usedmemory;
    }

    public Long getUsedmemoryrss() {
        return usedmemoryrss;
    }

    public void setUsedmemoryrss(Long usedmemoryrss) {
        this.usedmemoryrss = usedmemoryrss;
    }

    public Long getUsedmemorypeak() {
        return usedmemorypeak;
    }

    public void setUsedmemorypeak(Long usedmemorypeak) {
        this.usedmemorypeak = usedmemorypeak;
    }

    public Long getTotalsystemmemory() {
        return totalsystemmemory;
    }

    public void setTotalsystemmemory(Long totalsystemmemory) {
        this.totalsystemmemory = totalsystemmemory;
    }

    public Long getUsedmemorylua() {
        return usedmemorylua;
    }

    public void setUsedmemorylua(Long usedmemorylua) {
        this.usedmemorylua = usedmemorylua;
    }

    public Float getMemfragmentationratio() {
        return memfragmentationratio;
    }

    public void setMemfragmentationratio(Float memfragmentationratio) {
        this.memfragmentationratio = memfragmentationratio;
    }
}