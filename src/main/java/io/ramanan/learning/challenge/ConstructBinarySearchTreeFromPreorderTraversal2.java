package io.ramanan.learning.challenge;

public class ConstructBinarySearchTreeFromPreorderTraversal2 {
    private static int preIndex =0;
    public static TreeNode bstFromPreorder(int[] preorder) {
        return constructBST(preorder,Integer.MAX_VALUE); 
    }

    private static TreeNode constructBST(int[] preOrder,int val){
        if (preIndex==preOrder.length || val<preOrder[preIndex])
            return null;
        TreeNode root=new TreeNode(preOrder[preIndex++]);
        root.left=constructBST(preOrder,root.val);
        root.right=constructBST(preOrder,val);
        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
        public String toString() {
            return val+"->";
        }
    }

    public static void main(String[] args) {
        TreeNode node = bstFromPreorder(new int[] {8,5,1,7,10,12});
        System.out.println(node);
    }
}