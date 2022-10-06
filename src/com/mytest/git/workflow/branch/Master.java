package com.mytest.git.workflow.branch;

/**
 * 主分支
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 18:50
 */
public class Master {

    /**
     * 名字
     */
    private String name;
    /**
     * 描述
     */
    private String desc;

    /**
     * 提交哈希
     */
    private String commitHash;

    public String getName() {
        return name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
}
