package com.lmz.vo;

public class LabReservation {
    private Integer id;

    private String labName;

    private String startTime;

    private String endTime;

    private String labTeacher;

    private Integer labCurrent;

    private Integer labMax;

    private String studentName;

    private String studentId;

    private Integer labId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName == null ? null : labName.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getLabTeacher() {
        return labTeacher;
    }

    public void setLabTeacher(String labTeacher) {
        this.labTeacher = labTeacher == null ? null : labTeacher.trim();
    }

    public Integer getLabCurrent() {
        return labCurrent;
    }

    public void setLabCurrent(Integer labCurrent) {
        this.labCurrent = labCurrent;
    }

    public Integer getLabMax() {
        return labMax;
    }

    public void setLabMax(Integer labMax) {
        this.labMax = labMax;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        this.labId = labId;
    }
}