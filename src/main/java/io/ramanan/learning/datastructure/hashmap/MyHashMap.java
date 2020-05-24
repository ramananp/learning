package io.ramanan.learning.datastructure.hashmap;

import java.lang.reflect.Array;
import java.util.Objects;

public class MyHashMap<K, V> {
    
    private final static int CAPACITY = 16;

    @SuppressWarnings("unchecked")
    private Node<K, V>[] nodes = (Node [])Array.newInstance(Node.class, CAPACITY);

    public V put(K key, V value){
        int index = Objects.hashCode(key) % CAPACITY;
        Node<K, V> node = nodes[index];
        if(node == null) {
            nodes[index] = new Node<>(key, value, null);
            return null;
        }
        while(node != null){
            if(node.getKey().equals(key)){ //This needs to be checked inside the loop
                V existingValue = node.getValue();
                node.setValue(value);
                return existingValue;
            } else {
                if(node.getNext() == null){
                    node.setNext(new Node<>(key, value, null));
                    return null;
                }
                node = node.getNext();
            }
        }
        return null;
    }

    public V get(K key){
        int index = Objects.hashCode(key) % CAPACITY;
        Node<K, V> node = nodes[index];
        if(node == null) {
            return null;
        }
        while(node != null) {
            if(node.getKey().equals(key)) {
                return node.getValue();
            }
            node = node.getNext();
        }

        return null;
        
    }

}