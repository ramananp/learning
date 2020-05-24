package io.ramanan.learning.datastructure.linkedlist;

public class Node<E extends Comparable<E>> {

    private E data;
    private Node<E> next;

    public Node(E data){
        this.data = data;
        next = null;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getData(){
        return this.data;
    }

    public Node<E> getNext(){
        return next;
    }

    @Override
    public String toString(){
        return String.valueOf(data);
    }

}