package com.mytest.git.workflow.entity;

/**
 * PullRequest
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 18:50
 */
public class PullRequest {
    private String targetBranch;
    private String assignee;
    private String commitHash;

    public PullRequest() {
    }

    public PullRequest(String targetBranch, String assignee, String commitHash) {
        this.targetBranch = targetBranch;
        this.assignee = assignee;
        this.commitHash = commitHash;
    }

    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }
}
