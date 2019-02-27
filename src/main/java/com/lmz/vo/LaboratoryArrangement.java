package com.lmz.vo;

public class LaboratoryArrangement {
    private Integer libid;

    private String libname;

    private String libteacher;

    private String libinstruction;

    public Integer getLibid() {
        return libid;
    }

    public void setLibid(Integer libid) {
        this.libid = libid;
    }

    public String getLibname() {
        return libname;
    }

    public void setLibname(String libname) {
        this.libname = libname == null ? null : libname.trim();
    }

    public String getLibteacher() {
        return libteacher;
    }

    public void setLibteacher(String libteacher) {
        this.libteacher = libteacher == null ? null : libteacher.trim();
    }

    public String getLibinstruction() {
        return libinstruction;
    }

    public void setLibinstruction(String libinstruction) {
        this.libinstruction = libinstruction == null ? null : libinstruction.trim();
    }
}