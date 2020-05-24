package io.ramanan.learning.datastructure.linkedlist;

public class LinkedList<E extends Comparable<E>> implements Cloneable {

    private Node<E> head;

    public int size() {
        if(head == null){
            return 0;
        } else {
            int size = 0;
            Node<E> node = head;
            while(node != null){
                node = node.getNext();
                size++;
            }
            return size;
        }
    }

    public void add(E data) {
        if(head == null){
            head = new Node<>(data);
        } else {
            Node<E> node = head;
            while(node.getNext() != null){
                node = node.getNext();
            }
            node.setNext(new Node<>(data));
        }
    }

    public E pop() {
        if(head == null){
            return null;
        } else {
            E data = head.getData();
            head = head.getNext();
            return data;
        }
    }

    @Override
    public String toString(){
        if(head == null){
            return "";
        } else {
            String string = "";
            Node<E> node = head;
            while(node.getNext() != null){
                string += node + "\n";
                node = node.getNext();
            }
            return string;
        }
    }

}