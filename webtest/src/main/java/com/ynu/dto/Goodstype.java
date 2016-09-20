package com.ynu.dto;

public class Goodstype {
    private Integer gt_id;

    private int gt_parent_id;

    private String gt_parent_name;

    private String gt_name;

    private Integer gt_isvisible;

    private String gt_desc;

    public String getgt_parent_name() {
        return gt_parent_name;
    }

    public void setgt_parent_name(String gt_parent_name) {
        this.gt_parent_name = gt_parent_name == null ? null : gt_parent_name.trim();
    }

    public Integer getgt_id() {
        return gt_id;
    }

    public void setgt_id(Integer gt_id) {
        this.gt_id = gt_id;
    }

    public int getgt_parent_id() {
        return gt_parent_id;
    }

    public void setgt_parent_id(int gt_parent_id) {
        this.gt_parent_id = gt_parent_id;
    }

    public String getgt_name() {
        return gt_name;
    }

    public void setgt_name(String gt_name) {
        this.gt_name = gt_name == null ? null : gt_name.trim();
    }

    public Integer getgt_isvisible() {
        return gt_isvisible;
    }

    public void setgt_isvisible(Integer gt_isvisible) {
        this.gt_isvisible = gt_isvisible;
    }

    public String getgt_desc() {
        return gt_desc;
    }

    public void setgt_desc(String gt_desc) {
        this.gt_desc = gt_desc == null ? null : gt_desc.trim();
    }
}