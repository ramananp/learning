package io.ramanan.learning.challenge;

public class ReverseList {
    
    public static ListNode reverseList(ListNode head) {
        ListNode prev = head;
        ListNode next = head.next;
        ListNode node = null;
        while(next != null) {
            ListNode temp = next.next;
            next.next = prev;
            prev.next = node;
            prev = next;
            next = temp;
            node = prev;
        }
        return next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode node4 = new ListNode(4, tail);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);
        ListNode result = reverseList(head);
        while(result.next != null) {
            result = result.next;
            System.out.print(result.val+"->");
        }
        System.out.println();
    }

}