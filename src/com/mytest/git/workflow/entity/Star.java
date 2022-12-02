package com.mytest.git.workflow.entity;

/**
 * star
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 18:49
 */
public class Star {
    private String icon;
    private Integer number;

    public Star() {
    }

    public Star(String icon, Integer number) {
        this.icon = icon;
        this.number = number;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
