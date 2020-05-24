package io.ramanan.learning.challenge;

public class MergeTwoSortedArrayNodes {
    private static ListNode result;
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                addResult(l1.val);
                l1 = l1.next;
            } else {
                addResult(l2.val);
                l2 = l2.next;
            }
        }
        while(l1 != null) {
            addResult(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            addResult(l2.val);
            l2 = l2.next;
        }
        return result;
    }

    private static void addResult(int val) {
        if(result == null) {
            result = new ListNode(val);
        } else {
            findLast().next = new ListNode(val);
        }
    }

    private static ListNode findLast() {
        ListNode last = result;
        while(last.next != null) {
            last = last.next;
        }
        return last;
    }

    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        ListNode node14 = new ListNode(4);
        ListNode node12 = new ListNode(2, node14);
        ListNode node11 = new ListNode(1, node12);

        ListNode node24 = new ListNode(4);
        ListNode node23 = new ListNode(3, node24);
        ListNode node21 = new ListNode(1, node23);
        ListNode result = mergeTwoLists(node11, node21);
        System.out.println(result);
    }
}