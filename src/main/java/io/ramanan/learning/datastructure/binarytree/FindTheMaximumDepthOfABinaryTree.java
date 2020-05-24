package io.ramanan.learning.datastructure.binarytree;

public class FindTheMaximumDepthOfABinaryTree {

    private static int findMax(Node<Integer> root) {
        if(root == null) {
             return 0;
        }

        if(root.getLeft() == null && root.getRight() == null) {
            return 0;
        }

        int maxLeft = 1 + findMax(root.getLeft());
        int maxRight = 1 + findMax(root.getRight());

        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        Node<Integer> node7 = new Node<>(7, null, null);
        Node<Integer> node17 = new Node<>(7, null, null);
        Node<Integer> node19 = new Node<>(19, null, null);
        Node<Integer> node15 = new Node<>(15, null, null);
        Node<Integer> node18 = new Node<>(18, node17, node19);
        Node<Integer> node16 = new Node<>(16, node15, node18);
        Node<Integer> node14 = new Node<>(14, null, node16);
        Node<Integer> node6 = new Node<>(6, null, node7);
        Node<Integer> node8 = new Node<>(8, node6, node14);
        int maxDepth = findMax(node8);
        System.out.println(maxDepth);
    }

}