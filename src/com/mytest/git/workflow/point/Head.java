package com.mytest.git.workflow.point;

import com.mytest.git.workflow.entity.Commit;

/**
 * 头指针
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 18:57
 */
public class Head {
    /**
     *提交信息
     */
    private Commit commit;

    public Head(Commit commit) {
        this.commit = commit;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }
}
