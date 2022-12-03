package com.mytest.git.workflow.status;

/**
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/12/3 16:20
 */
public enum BranchFileStatus {
    COMMITTED("提交",""),
    UNTRACKED("未追踪",""),
    MODIFIED("修改",""),
    STAGED("暂存",""),
    DELETED("删除","");
    private String status;
    private String branchName;

    BranchFileStatus(String status, String branchName) {
        this.status = status;
        this.branchName = branchName;
    }

    public String getStatus() {
        return status;
    }

    public String getBranchName() {
        return branchName;
    }
}
