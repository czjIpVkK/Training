package com.ynu.dto;

import java.util.Date;

/**
 * Created by Vivianus on 2016/9/12.
 */
public class Goodsinformation {
    private Integer g_id;

    private Integer gt_id;

    private Integer gs_id;

    private String g_name;

    private Integer g_number;

    private Integer g_sellnumber;

    private Integer g_now_number;

    private Float g_price;

    private String g_pic;

    private String g_state;

    private Date g_uptime;

    private Integer g_uper;

    private Date g_modify_time;

    private Integer g_modfier;

    private String g_description;

    private String gt_name;

    private String gs_name;

    public String getgs_name(){
        return this.gs_name;
    }

    public void setgs_name(String gs_name){
        this.gs_name=gs_name;
    }
    public Integer getg_id() {
        return g_id;
    }

    public void setg_id(Integer g_id) {
        this.g_id = g_id;
    }

    public Integer getgt_id() {
        return gt_id;
    }

    public void setgt_id(Integer gt_id) {
        this.gt_id = gt_id;
    }

    public Integer getgs_id() {
        return gs_id;
    }

    public void setgs_id(Integer gs_id) {
        this.gs_id = gs_id;
    }

    public String getg_name() {
        return g_name;
    }

    public void setg_name(String g_name) {
        this.g_name = g_name == null ? null : g_name.trim();
    }

    public Integer getg_number() {
        return g_number;
    }

    public void setg_number(Integer g_number) {
        this.g_number = g_number;
    }

    public Integer getg_sellnumber() {
        return g_sellnumber;
    }

    public void setg_sellnumber(Integer g_sellnumber) {
        this.g_sellnumber = g_sellnumber;
    }

    public Integer getg_now_number() {
        return g_now_number;
    }

    public void setg_now_number(Integer g_now_number) {
        this.g_now_number = g_now_number;
    }

    public Float getg_price() {
        return g_price;
    }

    public void setg_price(Float g_price) {
        this.g_price = g_price;
    }

    public String getg_pic() {
        return g_pic;
    }

    public void setg_pic(String g_pic) {
        this.g_pic = g_pic == null ? null : g_pic.trim();
    }

    public String getg_state() {
        return g_state;
    }

    public void setg_state(String g_state) {
        this.g_state = g_state == null ? null : g_state.trim();
    }

    public Date getg_uptime() {
        return g_uptime;
    }

    public void setg_uptime(Date g_uptime) {
        this.g_uptime = g_uptime;
    }

    public Integer getg_uper() {
        return g_uper;
    }

    public void setg_uper(Integer g_uper) {
        this.g_uper = g_uper;
    }

    public Date getg_modify_time() {
        return g_modify_time;
    }

    public void setg_modify_time(Date g_modify_time) {
        this.g_modify_time = g_modify_time;
    }

    public Integer getg_modfier() {
        return g_modfier;
    }

    public void setg_modfier(Integer g_modfier) {
        this.g_modfier = g_modfier;
    }

    public String getg_description() {
        return g_description;
    }

    public void setg_description(String g_description) {
        this.g_description = g_description == null ? null : g_description.trim();
    }

    public String getgt_name() {
        return gt_name;
    }

    public void setgt_name(String gt_name) {
        this.gt_name = gt_name == null ? null : gt_name.trim();
    }
}
