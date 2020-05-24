package io.ramanan.learning.challenge;

public class ValidSequenceInABinaryTree {
    public static boolean isValidSequence(TreeNode root, int[] arr) {
        return checkValidity(root, arr, 0);
    }

    private static boolean checkValidity(TreeNode node, int[] arr, int index) {
        if(node == null || index>=arr.length) return false;
        if(node.left == null && node.right == null) return arr[index] == node.val && index == arr.length-1;
        if(node.val == arr[index]) return checkValidity(node.left, arr, index+1) || checkValidity(node.right, arr, index+1);
        return false;
    }


    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(1);
        TreeNode node2 = new TreeNode(0, null, node3);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(0);
        TreeNode node4 = new TreeNode(1, node5, node6);
        TreeNode node1 = new TreeNode(1, node2, node4);

        TreeNode node8 = new TreeNode(0);
        TreeNode node7 = new TreeNode(0, node8, null);
        TreeNode root = new TreeNode(0, node1, node7);
        System.out.println(isValidSequence(root, new int[]{0,1,1,0}));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}