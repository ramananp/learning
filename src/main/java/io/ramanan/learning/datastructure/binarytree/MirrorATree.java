package io.ramanan.learning.datastructure.binarytree;

public class MirrorATree {

    private static void mirror(Node<Integer> root) {
        if(root == null) {
            return;
        }

        mirror(root.getLeft());
        mirror(root.getRight());

        Node<Integer> temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

    }

    public static void main(String[] args) {
        Node<Integer> node7 = new Node<>(7, null, null);
        Node<Integer> node15 = new Node<>(15, null, null);
        Node<Integer> node18 = new Node<>(18, null, null);
        Node<Integer> node16 = new Node<>(16, node15, node18);
        Node<Integer> node14 = new Node<>(14, null, node16);
        Node<Integer> node6 = new Node<>(6, null, node7);
        Node<Integer> node8 = new Node<>(8, node6, node14);
        mirror(node8);
        System.out.println(node8);
    }

}