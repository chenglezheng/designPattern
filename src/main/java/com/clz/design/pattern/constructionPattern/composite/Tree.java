package com.clz.design.pattern.constructionPattern.composite;

public class Tree {

    TreeNode treeNode=null;

    public Tree(String name) {
        this.treeNode = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.treeNode.add(nodeB);
        System.out.println(tree.treeNode.getChildren().nextElement().getName());
        System.out.println("build the tree finished!");
    }
}
