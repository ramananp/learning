package io.ramanan.learning.search;

import io.ramanan.learning.datastructure.binarytree.Node;
import io.ramanan.learning.datastructure.stack.Stack;

public class DepthFirst {

    private static void preOrderTraverseUsingStack(Node<String> root) {
        if(root == null) {
            return;
        }
        Stack<Node<String>> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node<String> node = stack.pop();
            System.out.println(node.getData());
            if(node.getRight() != null) {
                stack.push(node.getRight());
            }
            if(node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
    }

    private static void preOrderTraverse(Node<String> root) {
        if(root == null) {
            return;
        }
        System.out.println(root.getData());
        preOrderTraverse(root.getLeft());
        preOrderTraverse(root.getRight());
    }

    
    private static void inOrderTraverseUsingStack(Node<String> root) {
        if(root == null) {
            return;
        }
        Stack<Node<String>> stack = new Stack<>();
        Node<String> curr = root;
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.getLeft();
            }
            curr = stack.pop();
            System.out.println(curr.getData());
            curr = curr.getRight();
        }
    }

    private static void inOrderTraverse(Node<String> root) {
        if(root == null) {
            return;
        }
        inOrderTraverse(root.getLeft());
        System.out.println(root.getData());
        inOrderTraverse(root.getRight());
    }

    private static void postOrderTraverseUsingStack(Node<String> root) {
        if (root == null) {
            return;
        }
        Stack<Node<String>> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            Node<String> next = stack.peek();
            
            boolean finishedSubtrees = (next.getRight() == root || next.getLeft() == root);
            boolean isLeaf = (next.getLeft() == null && next.getRight() == null);
            if (finishedSubtrees || isLeaf) {
                stack.pop();
                System.out.println(next.getData());
                root = next;
            }
            else {
                if (next.getRight() != null) {
                    stack.push(next.getRight());
                }
                if (next.getLeft() != null) {
                    stack.push(next.getLeft());
                }
            }
        }
    }

    private static void postOrderTraverse(Node<String> root) {
        if(root == null) {
            return;
        }
        postOrderTraverse(root.getLeft());
        postOrderTraverse(root.getRight());
        System.out.println(root.getData());
    }

    public static void main(String[] args) {
        //                     A
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
        System.out.println("Pre Order Traversal Using Recursion");
        System.out.println("-----------------------------------");
        preOrderTraverse(a);
        System.out.println("Pre Order Traversal Using Stack");
        System.out.println("-------------------------------");
        preOrderTraverseUsingStack(a);
        System.out.println("In Order Traversal Using Recursion");
        System.out.println("----------------------------------");
        inOrderTraverse(a);
        System.out.println("In Order Traversal Using Stack");
        System.out.println("------------------------------");
        inOrderTraverseUsingStack(a);
        System.out.println("Post Order Traversal Using Recursion");
        System.out.println("------------------------------------");
        postOrderTraverse(a);
        System.out.println("Post Order Traversal Using Stack");
        System.out.println("--------------------------------");
        postOrderTraverseUsingStack(a);
    }

}