package io.ramanan.learning.challenge;

public class FloydCycleDetection {

    static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private static void detect(Node node) {
        if(node == null || node.next == null) {
            return;
        }
        Node slow = node;
        Node fast = node;
        boolean isACycle = false;
        while (fast != null  && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                isACycle = true;
                break;
            }
        }
        System.out.println(isACycle);
        if(isACycle) {
            slow = node;
            firstCycleNode(slow, fast);
        }
    }

    private static void firstCycleNode(Node slow, Node fast) {
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.value);
    }

    public static void main(String[] args) {
        Node _6 = new Node(6);
        Node _5 = new Node(5, _6);
        Node _4 = new Node(4, _5);
        Node _3 = new Node(3, _4);
        Node _2 = new Node(2, _3);
        Node _1 = new Node(1, _2);
        _6.next = _5;
        detect(_1);
    }
}