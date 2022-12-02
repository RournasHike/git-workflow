package com.mytest.git.workflow.entity;

/**
 * git fork
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 18:49
 */
public class Fork {
    private String icon;
    private Integer number;

    public Fork() {
    }

    public Fork(String icon, Integer number) {
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
