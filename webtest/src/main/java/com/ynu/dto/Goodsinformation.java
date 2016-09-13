package com.ynu.dto;

/**
 * Created by Vivianus on 2016/9/12.
 */
public class Goodsinformation {
    private Integer g_id;

    private Integer gt_id;

    private String g_name;

    private String g_description;

    private Integer g_number;

    private String g_pic;

    private String gt_type;

    private Float g_price;

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

    public String getg_name() {
        return g_name;
    }

    public void setg_name(String g_name) {
        this.g_name = g_name == null ? null : g_name.trim();
    }

    public String getg_description() {
        return g_description;
    }

    public void setg_description(String g_description) {
        this.g_description = g_description == null ? null : g_description.trim();
    }

    public Integer getg_number() {
        return g_number;
    }

    public void setg_number(Integer g_number) {
        this.g_number = g_number;
    }

    public String getg_pic() {
        return g_pic;
    }

    public void setg_pic(String g_pic) {
        this.g_pic = g_pic == null ? null : g_pic.trim();
    }

    public String getgt_type() {
        return gt_type;
    }

    public void setgt_type(String gt_type) {
        this.gt_type = gt_type == null ? null : gt_type.trim();
    }

    public Float getg_price() {
        return g_price;
    }

    public void setg_price(Float g_price) {
        this.g_price = g_price;
    }
}
