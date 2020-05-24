package io.ramanan.learning.datastructure.binarytree;

public class PrintNodesInBSTRange {

    private static void print(Node<Integer> root, int low, int high) {
        if(root == null) {
            return;
        }

        if(low <= root.getData()) {
            print(root.getLeft(), low, high);
        }

        if(low <= root.getData() && root.getData() <= high) {
            System.out.println(root.getData());
        }

        if(high > root.getData()) {
            print(root.getRight(), low, high);
        }
    }

    public static void main(String[] args) {
        Node<Integer> node7 = new Node<>(7, null, null);
        Node<Integer> node15 = new Node<>(15, null, null);
        Node<Integer> node18 = new Node<>(18, null, null);
        Node<Integer> node16 = new Node<>(16, node15, node18);
        Node<Integer> node14 = new Node<>(14, null, node16);
        Node<Integer> node6 = new Node<>(6, null, node7);
        Node<Integer> node8 = new Node<>(8, node6, node14);
        print(node8, 7, 17);
    }

}