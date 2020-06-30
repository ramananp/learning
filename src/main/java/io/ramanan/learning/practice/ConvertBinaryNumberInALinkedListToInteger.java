package io.ramanan.learning.practice;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * 1290. Convert Binary Number in a Linked List to Integer
 */

public class ConvertBinaryNumberInALinkedListToInteger {
    public static int getDecimalValue(ListNode head) {
        if(head == null) {
            return 0;
        }
        int decimal = 0;
        while(head != null) {
            decimal = decimal * 2 + head.val;
            head = head.next;
        }
        return decimal;
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
        System.out.println(getDecimalValue(head));
    }
}