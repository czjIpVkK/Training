package com.ynu.dto;

import java.util.Date;

/**
 * Created by Vivianus on 2016/9/6.
 */
public class User {
    private int u_id;

    private int ut_id;

    private String u_name;

    private Date u_birthday;

    private Boolean u_Gender;

    private String u_description;

    private String u_PassWord;

    private int u_credits;

    private Double u_balance;

    public int getuId() {
        return u_id;
    }

    public void setuId(int u_id) {
        this.u_id = u_id;
    }

    public int getUtId() {
        return ut_id;
    }

    public void setUtId(int ut_id) {
        this.ut_id = ut_id;
    }

    public String getuName() {
        return u_name;
    }

    public void setuName(String u_name) {
        this.u_name = u_name == null ? null : u_name.trim();
    }

    public Date u_birthday() {
        return u_birthday;
    }

    public void setuBirthday(Date u_birthday) {
        this.u_birthday = u_birthday;
    }

    public Boolean u_Gender() {
        return u_Gender;
    }

    public void setuGender(Boolean uGender) {
        this.u_Gender = u_Gender;
    }

    public String getuDescription() {
        return u_description;
    }

    public void setuDescription(String u_description) {
        this.u_description = u_description == null ? null : u_description.trim();
    }

    public String getuPassword() {
        return u_PassWord;
    }

    public void setuPassword(String u_PassWord) {
        this.u_PassWord = u_PassWord == null ? null : u_PassWord.trim();
    }

    public int getuCredits() {
        return u_credits;
    }

    public void setuCredits(int u_credits) {
        this.u_credits = u_credits;
    }

    public Double getuBalance() {
        return u_balance;
    }

    public void setuBalance(Double u_balance) {
        this.u_balance = u_balance;
    }
}