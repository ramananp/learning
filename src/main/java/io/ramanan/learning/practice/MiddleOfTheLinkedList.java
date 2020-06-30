package io.ramanan.learning.practice;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * 876. Middle of the Linked List
 */

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode _1 = new ListNode(0);
        ListNode _0 = new ListNode(0);
        ListNode head = new ListNode(1);
        head.next = _0;
        _0.next = _1;
        System.out.println(middleNode(head).val);
    }
}