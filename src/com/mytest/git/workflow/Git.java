package com.mytest.git.workflow;

import com.mytest.git.workflow.branch.Branch;
import com.mytest.git.workflow.entity.Commit;
import com.mytest.git.workflow.point.Head;

import java.util.List;

/**
 * git is a very useful version control system
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 18:58
 */
public class Git {
    /**
     * 头指针
     */
    private Head head;
    /**
     * 当前分支
     */
    private Branch currentBranch;
    /**
     * 当前提交
     */
    private Commit currentCommit;
}
