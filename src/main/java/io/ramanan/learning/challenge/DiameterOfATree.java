package io.ramanan.learning.challenge;

public class DiameterOfATree {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
  
        int rootDiameter = getHeight(root.left) + getHeight(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
  
        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
    }
  
    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
  
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
    
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
      TreeNode(int x, TreeNode left, TreeNode right) {
        this.val = x;
        this.left = left;
        this.right = right;
      }
    }
    
    public static void main(String[] args) {
      DiameterOfATree solution = new DiameterOfATree();
      TreeNode _5 = new TreeNode(5);
      TreeNode _4 = new TreeNode(4);
      TreeNode _3 = new TreeNode(3);
      TreeNode _2 = new TreeNode(2, _4, _5);
      TreeNode _1 = new TreeNode(1, _2, _3);
      System.out.println(solution.diameterOfBinaryTree(_1));
    }

}