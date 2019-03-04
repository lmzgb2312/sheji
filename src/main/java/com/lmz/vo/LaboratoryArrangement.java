package com.lmz.vo;

import java.util.Date;

public class LaboratoryArrangement {
    private Integer labId;

    private String labName;

    private String labTeacher;

    private String labInstruction;

    private String labStartTime;

    private String labEndTime;

    private Integer labPersonAmount;

    private Date gmtCreated;

    private Date gmtModified;

    private Integer labPersonAmountNow;

    private Integer timePeriod;

    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        this.labId = labId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName == null ? null : labName.trim();
    }

    public String getLabTeacher() {
        return labTeacher;
    }

    public void setLabTeacher(String labTeacher) {
        this.labTeacher = labTeacher == null ? null : labTeacher.trim();
    }

    public String getLabInstruction() {
        return labInstruction;
    }

    public void setLabInstruction(String labInstruction) {
        this.labInstruction = labInstruction == null ? null : labInstruction.trim();
    }

    public String getLabStartTime() {
        return labStartTime;
    }

    public void setLabStartTime(String labStartTime) {
        this.labStartTime = labStartTime;
    }

    public String getLabEndTime() {
        return labEndTime;
    }

    public void setLabEndTime(String labEndTime) {
        this.labEndTime = labEndTime;
    }

    public Integer getLabPersonAmount() {
        return labPersonAmount;
    }

    public void setLabPersonAmount(Integer labPersonAmount) {
        this.labPersonAmount = labPersonAmount;
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

    public Integer getLabPersonAmountNow() {
        return labPersonAmountNow;
    }

    public void setLabPersonAmountNow(Integer labPersonAmountNow) {
        this.labPersonAmountNow = labPersonAmountNow;
    }

    public Integer getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Integer timePeriod) {
        this.timePeriod = timePeriod;
    }
}