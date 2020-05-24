package io.ramanan.learning.challenge;

public class ConstructBinarySearchTreeFromPreorderTraversal {

    private static TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, 0, preorder.length);
    }
    
    private static TreeNode build(int[] preorder, int l, int r) {
        if (l >= r) return null;
        TreeNode root = new TreeNode(preorder[l]);
        for (int m = l + 1; m <= r; m++) {
            if (m == r || preorder[m] > root.val) {
                root.left = build(preorder, l + 1, m);
                root.right = build(preorder, m, r);
                break;
            }
        }
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