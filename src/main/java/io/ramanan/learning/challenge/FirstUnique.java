package io.ramanan.learning.challenge;

import java.util.HashMap;
import java.util.Map;

public class FirstUnique {

    private Node head = new Node(0);
    private Node tail = new Node(0);
    private Map<Integer, Node> map = new HashMap<>();

    public FirstUnique(int[] nums) {
        head.next = tail;
        tail.prev = head;
        for(int num : nums) {
            add(num);
        }
    }
    
    public int showFirstUnique() {
        if(head.next == tail) {
            return -1;
        }
        return head.next.value;
    }
    
    public void add(int value) {
        if(map.get(value) == null) {
            Node node = add(new Node(value));
            map.put(value, node);
        } else {
            Node node = map.get(value);
            map.remove(value);
            remove(node);
        }
    }
    
    private Node add(Node node) {
        Node last = tail.prev;
        last.next = node;
        node.prev = last;
        node.next = tail;
        tail.prev = node;
        return node;
    }
    
    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    
    class Node {
        int value;
        Node prev;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {247,832,337,788,183,979,616,769,279,912,614,286,581,316,380,579,57,536,694,454,431,982,780,709,992,824,525,294,268,546,399,264,717,81,602,656,621,91,671,507,543,671,933,247,357,134,121,195,849,83,88};
        FirstUnique obj = new FirstUnique(nums);
        System.out.println(obj.showFirstUnique());
    }
}