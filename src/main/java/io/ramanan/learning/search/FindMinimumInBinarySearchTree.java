package io.ramanan.learning.search;

import io.ramanan.learning.datastructure.binarytree.Node;

public class FindMinimumInBinarySearchTree {

    private static Node<Integer> findMinimum(Node<Integer> root) {
        if(root == null) {
            return null;
        }

        if(root.getLeft() == null) {
            return root;
        }

        return findMinimum(root.getLeft());

    }

    public static void main(String[] args) {
        Node<Integer> node7 = new Node<>(7, null, null);
        Node<Integer> node15 = new Node<>(15, null, null);
        Node<Integer> node18 = new Node<>(18, null, null);
        Node<Integer> node16 = new Node<>(16, node15, node18);
        Node<Integer> node14 = new Node<>(14, null, node16);
        Node<Integer> node6 = new Node<>(6, null, node7);
        Node<Integer> node8 = new Node<>(8, node6, node14);
        Node<Integer> node = findMinimum(node8);
        System.out.println(node.getData());
    }

}