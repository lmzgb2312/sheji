package com.lmz.vo;

public class LoginPermissions {
    private Integer id;

    private String username;

    private String password;

    private String personName;

    private Integer personRight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public Integer getPersonRight() {
        return personRight;
    }

    public void setPersonRight(Integer personRight) {
        this.personRight = personRight;
    }
}