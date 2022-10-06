package com.mytest.git.workflow.entity;

/**
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 18:50
 */
public class Account {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
