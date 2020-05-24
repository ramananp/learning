package io.ramanan.learning.datastructure.binarytree;

public class IsBinarySearchTree {

    private static boolean isBinarySearchTree(Node<Integer> root, int min, int max) {
        if(root == null) {
            return true;
        }

        if(root.getData() < min || root.getData() > max ) {
            return false;
        }

        return isBinarySearchTree(root.getLeft(), min, root.getData()) 
                    && isBinarySearchTree(root.getRight(), root.getData(), max);
    }

    public static void main(String[] args) {
        Node<Integer> node7 = new Node<>(7, null, null);
        Node<Integer> node15 = new Node<>(15, null, null);
        Node<Integer> node18 = new Node<>(18, null, null);
        Node<Integer> node16 = new Node<>(16, node18, node15);
        Node<Integer> node14 = new Node<>(14, null, node16);
        Node<Integer> node6 = new Node<>(6, null, node7);
        Node<Integer> node8 = new Node<>(8, node6, node14);
        System.out.println(isBinarySearchTree(node8, 6, 19));
    }

}