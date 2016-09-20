package com.ynu.dto;

public class Admin {
    private Integer A_id;

    private String A_name;

    private String A_password;

    public Integer getA_id() {
        return A_id;
    }

    public void setA_id(Integer A_id) {
        this.A_id = A_id;
    }

    public String getA_name() {
        return A_name;
    }

    public void setA_name(String A_name) {
        this.A_name = A_name == null ? null : A_name.trim();
    }

    public String getA_password() {
        return A_password;
    }

    public void setA_password(String A_password) {
        this.A_password = A_password == null ? null : A_password.trim();
    }
}