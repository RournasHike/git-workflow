package com.mytest.git.workflow.area;

import java.util.List;

/**
 * @author Alex
 * @version 1.0.0
 * @company
 * @copyright (c)   Inc. All rights reserved.
 * @date 2022/8/6 18:55
 */
public class WorkingDirectory {
    private WorkingTree workingTree;

    public WorkingDirectory(WorkingTree tree){
        this.workingTree = tree;
    }

    // TODO
}

class WorkingTree{
    private Node treeRoot;

    public Node getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(Node treeRoot) {
        this.treeRoot = treeRoot;
    }
}

class Node{
    private Integer no;
    private List<Node> nodeList;
    private String desc;
    private Integer size;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public List<Node> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}