package io.ramanan.learning.challenge;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private final Node head = new Node();
    private final Node tail = new Node();
    private final int capacity;
    private final Map<Integer, Node> nodeMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        nodeMap = new HashMap<>(capacity);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = nodeMap.get(key);
        if(node == null) {
            return -1;
        }
        remove(node);
        add(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        Node oldNode = nodeMap.get(key);
        if(oldNode != null) {
            oldNode.value = value;
            remove(oldNode);
            add(oldNode);
        } else if(nodeMap.size() == capacity) {
            nodeMap.remove(tail.prev.key);
            remove(tail.prev);
        }
        if(oldNode == null) {
            Node node = new Node();
            node.key = key;
            node.value = value;
            nodeMap.put(key, node);
            add(node);
        }
    }
    
    private void add(Node node) {
        Node prevNode = head.next;
        head.next = node;
        node.next = prevNode;
        prevNode.prev = node;
        node.prev = head;
    }
    
    private void remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        System.out.println(cache.get(2));
        cache.put(2, 6);
        System.out.println(cache.get(1));
        cache.put(1, 5);
        cache.put(1, 2);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
    }

}