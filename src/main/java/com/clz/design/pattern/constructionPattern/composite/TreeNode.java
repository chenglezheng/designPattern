package com.clz.design.pattern.constructionPattern.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {

    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children=new Vector<TreeNode>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    //添加孩子节点
    public void add(TreeNode treeNode){
        children.add(treeNode);
    }

    //移除孩子节点
    public void remove(TreeNode treeNode){
        children.remove(treeNode);
    }

    //获得孩子节点
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }

}
