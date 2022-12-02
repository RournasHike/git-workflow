package com.mytest.git.workflow.entity;

/**
 * 问题
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 18:50
 */
public class Issue {
    private String issueNo;
    private String desc;
    private String branch;

    public Issue() {
    }

    public Issue(String issueNo, String desc, String branch) {
        this.issueNo = issueNo;
        this.desc = desc;
        this.branch = branch;
    }

    public String getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
