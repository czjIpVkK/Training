package com.ynu.dto;

import java.util.Date;

/**
 * Created by Vivianus on 2016/9/6.
 */
public class User {
    private Integer u_id;

    private Integer ut_id;

    private String u_name;

    private String u_pass;

    private Date u_birthday;

    private Integer u_gender;

    private String u_description;

    private String u_mobile;

    private String u_card_no;

    private String u_address;

    private Integer u_isuse;

    private Double u_balance;

    private Integer u_credits;

    public Integer getu_id() {
        return u_id;
    }

    public void setu_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getut_id() {
        return ut_id;
    }

    public void setut_id(Integer ut_id) {
        this.ut_id = ut_id;
    }

    public String getu_name() {
        return u_name;
    }

    public void setu_name(String u_name) {
        this.u_name = u_name == null ? null : u_name.trim();
    }

    public String getu_pass() {
        return u_pass;
    }

    public void setu_pass(String u_pass) {
        this.u_pass = u_pass == null ? null : u_pass.trim();
    }

    public Date getu_birthday() {
        return u_birthday;
    }

    public void setu_birthday(Date u_birthday) {
        this.u_birthday = u_birthday;
    }

    public Integer getu_gender() {
        return u_gender;
    }

    public void setu_gender(Integer u_gender) {
        this.u_gender = u_gender;
    }

    public String getu_description() {
        return u_description;
    }

    public void setu_description(String u_description) {
        this.u_description = u_description == null ? null : u_description.trim();
    }

    public String getu_mobile() {
        return u_mobile;
    }

    public void setu_mobile(String u_mobile) {
        this.u_mobile = u_mobile == null ? null : u_mobile.trim();
    }

    public String getu_card_no() {
        return u_card_no;
    }

    public void setu_card_no(String u_card_no) {
        this.u_card_no = u_card_no == null ? null : u_card_no.trim();
    }

    public String getu_address() {
        return u_address;
    }

    public void setu_address(String u_address) {
        this.u_address = u_address == null ? null : u_address.trim();
    }

    public Integer getu_isuse() {
        return u_isuse;
    }

    public void setu_isuse(Integer u_isuse) {
        this.u_isuse = u_isuse;
    }

    public Double getu_balance() {
        return u_balance;
    }

    public void setu_balance(Double u_balance) {
        this.u_balance = u_balance;
    }

    public Integer getu_credits() {
        return u_credits;
    }

    public void setu_credits(Integer u_credits) {
        this.u_credits = u_credits;
    }
}