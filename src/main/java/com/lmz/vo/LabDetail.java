package com.lmz.vo;

import java.util.Date;

public class LabDetail {
    private Integer labDetailId;

    private String labDetailName;

    private String labDetailTeacher;

    private String labDetailInstruction;

    private Date gmtCreated;

    public Integer getLabDetailId() {
        return labDetailId;
    }

    public void setLabDetailId(Integer labDetailId) {
        this.labDetailId = labDetailId;
    }

    public String getLabDetailName() {
        return labDetailName;
    }

    public void setLabDetailName(String labDetailName) {
        this.labDetailName = labDetailName == null ? null : labDetailName.trim();
    }

    public String getLabDetailTeacher() {
        return labDetailTeacher;
    }

    public void setLabDetailTeacher(String labDetailTeacher) {
        this.labDetailTeacher = labDetailTeacher == null ? null : labDetailTeacher.trim();
    }

    public String getLabDetailInstruction() {
        return labDetailInstruction;
    }

    public void setLabDetailInstruction(String labDetailInstruction) {
        this.labDetailInstruction = labDetailInstruction == null ? null : labDetailInstruction.trim();
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }
}