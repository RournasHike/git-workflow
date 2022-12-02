package com.mytest.git.workflow.operation;

/**
 * git操作
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 19:06
 */
public abstract class GitOperation {
    /**
     * 名字
     */
    private String name;
    /**
     * 命令行
     */
    private String commandLine;
    /**
     * desc
     */
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommandLine() {
        return commandLine;
    }

    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
