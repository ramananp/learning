package io.ramanan.learning.datastructure.stack;

public class Stack<E> {

    private final static int MAX_SIZE = 10;
    private Element<E> top;
    private int size = 0;
    
    public void push(E data) {
        if(size == MAX_SIZE) {
            throw new StackOverflowException();
        }
        top = new Element<E>(data, top);
        size++;
    }

    public E pop() {
        if(size == 0) {
            throw new StackUnderflowException();
        }
        E data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    public E peek() {
        if(size == 0) {
            throw new StackUnderflowException();
        }
        return top.getData();
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size(){
        return size;
    }
}