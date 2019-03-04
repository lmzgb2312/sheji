package com.lmz.vo;

import java.util.Date;

public class LabExtendInfo {
    private Integer id;

    private String labExtendName;

    private String labExtendTeacher;

    private String labExtendStartTime;

    private String labExtendEndTime;

    private Integer labExtendPeriodTime;

    private Date gmtCreated;

    private Date gmtModified;

    private Integer labExtendAmount;

    private Integer labExtendCurrent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabExtendName() {
        return labExtendName;
    }

    public void setLabExtendName(String labExtendName) {
        this.labExtendName = labExtendName == null ? null : labExtendName.trim();
    }

    public String getLabExtendTeacher() {
        return labExtendTeacher;
    }

    public void setLabExtendTeacher(String labExtendTeacher) {
        this.labExtendTeacher = labExtendTeacher == null ? null : labExtendTeacher.trim();
    }

    public String getLabExtendStartTime() {
        return labExtendStartTime;
    }

    public void setLabExtendStartTime(String labExtendStartTime) {
        this.labExtendStartTime = labExtendStartTime;
    }

    public String getLabExtendEndTime() {
        return labExtendEndTime;
    }

    public void setLabExtendEndTime(String labExtendEndTime) {
        this.labExtendEndTime = labExtendEndTime;
    }

    public Integer getLabExtendPeriodTime() {
        return labExtendPeriodTime;
    }

    public void setLabExtendPeriodTime(Integer labExtendPeriodTime) {
        this.labExtendPeriodTime = labExtendPeriodTime;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getLabExtendAmount() {
        return labExtendAmount;
    }

    public void setLabExtendAmount(Integer labExtendAmount) {
        this.labExtendAmount = labExtendAmount;
    }

    public Integer getLabExtendCurrent() {
        return labExtendCurrent;
    }

    public void setLabExtendCurrent(Integer labExtendCurrent) {
        this.labExtendCurrent = labExtendCurrent;
    }
}