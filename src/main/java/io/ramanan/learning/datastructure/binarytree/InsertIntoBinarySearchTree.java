package io.ramanan.learning.datastructure.binarytree;

public class InsertIntoBinarySearchTree {

    private static Node<Integer> insert(Node<Integer> head, Node<Integer> node) {
        if(head == null) {
            return node;
        }

        if(node.getData() >= head.getData()) {
            head.setRight(insert(head.getRight(), node));
        } else {
            head.setLeft(insert(head.getLeft(), node));
        }

        return head;

    }
    
    public static void main(String[] args) {
        //Node<Integer> node4 = new Node<>(4, null, null);
        Node<Integer> node7 = new Node<>(7, null, null);
        Node<Integer> node15 = new Node<>(15, null, null);
        Node<Integer> node18 = new Node<>(18, null, null);
        Node<Integer> node16 = new Node<>(16, node15, node18);
        Node<Integer> node14 = new Node<>(14, null, node16);
        Node<Integer> node6 = new Node<>(6, null, node7);
        Node<Integer> node8 = new Node<>(8, node6, node14);
        Node<Integer> node = insert(node8, new Node<>(9, null, null));
        System.out.println(node);
    }

}