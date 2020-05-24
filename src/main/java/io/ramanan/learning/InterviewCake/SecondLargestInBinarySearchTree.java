package io.ramanan.learning.InterviewCake;

public class SecondLargestInBinarySearchTree {

    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }
    }

    public static int findSecondLargest(BinaryTreeNode rootNode) {

        // find the second largest item in the binary search tree
        BinaryTreeNode parent = rootNode;
        BinaryTreeNode right;
        BinaryTreeNode left;
        if(rootNode.right == null && rootNode.left != null) {
            left = rootNode.left;
            right = left.right;
            while(right != null && right.right != null) {
                right = right.right;
            }
            return right == null ? left.value: right.value;
        }
        right = rootNode.right;
        while(right != null && right.right != null) {
            parent = right;
            right = right.right;
        }

        if(right != null && right.left != null) {
            parent = right;
            left = right.left;
            right = left.right;
            while(right != null && right.right != null) {
                right = right.right;
            }
            return right == null ? left.value: right.value;
        }

        return parent.value;
    }

    public static void main(String[] args) {
        final BinaryTreeNode root = new BinaryTreeNode(50);
        final BinaryTreeNode a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTreeNode b = root.insertRight(70).insertLeft(60);
        b.insertLeft(55).insertRight(58);
        b.insertRight(65);
        final int actual = findSecondLargest(root);
        System.out.println(actual);
    }

}