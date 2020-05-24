package io.ramanan.learning.search;

import io.ramanan.learning.datastructure.queue.Queue;
import io.ramanan.learning.datastructure.binarytree.*;

public class BreathFirst {

    private static void traverse(Node<String> root) {
        if(root == null) {
            return;
        }
        Queue<Node<String>> queue = new Queue<>();
        queue.enqueue(root);
        while(!queue.isEmpty()) {
            Node<String> node = queue.dequeue();
            System.out.println(node.getData());
            if(node.getLeft() != null) {
                queue.enqueue(node.getLeft());
            }
            if(node.getRight() != null) {
                queue.enqueue(node.getRight());
            }
        }
        
    }

    public static void main(String[] args) {
        //                    A
        //                  /    \
        //                 /      \
        //                B        C
        //               / \      / \
        //              /   \    /   \
        //             D     E  F     G
        //                    \       /\
        //                     H      I J
        //                    /
        //                   K

        Node<String> k = new Node<>("K", null, null);
        Node<String> j = new Node<>("J", null, null);
        Node<String> i = new Node<>("I", null, null);
        Node<String> h = new Node<>("H", k, null);
        Node<String> g = new Node<>("G", i, j);
        Node<String> f = new Node<>("F", null, null);
        Node<String> e = new Node<>("E", null, h);
        Node<String> d = new Node<>("D", null, null);
        Node<String> c = new Node<>("C", f, g);
        Node<String> b = new Node<>("B", d, e);
        Node<String> a = new Node<>("A", b, c);
        traverse(a);
    }
}