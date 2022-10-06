package com.mytest.git.workflow.area;

/**
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 18:55
 */
public class StagingArea {
    private Long size;
    private Long postBufferSize;
    private String desc;

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getPostBufferSize() {
        return postBufferSize;
    }

    public void setPostBufferSize(Long postBufferSize) {
        this.postBufferSize = postBufferSize;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
