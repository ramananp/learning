package io.ramanan.learning.datastructure.queue;

import java.lang.reflect.Array;

public class Queue<T> {

    private final static int SPECIAL_EMPTY_INDICATOR = -1;
    private final static int SIZE = 5;
    private int head = SPECIAL_EMPTY_INDICATOR;
    private int tail = SPECIAL_EMPTY_INDICATOR;
    private T[] elements;

    @SuppressWarnings("unchecked")
    public Queue() {
        elements = (T[])Array.newInstance(Object.class, SIZE);
    }

    public boolean isFull() {
        return head == (tail+1)%SIZE;
    }

    public boolean isEmpty() {
        return head == SPECIAL_EMPTY_INDICATOR;
    }

    public T peek() {
        if(isEmpty()) {
            throw new QueueUnderflowException();
        }
        return elements[head];
    }

    public void enqueue(T data) {
        if(isFull()) {
            throw new QueueOverflowException();
        }
        if(head == SPECIAL_EMPTY_INDICATOR) {
            head = tail = 0;
        } else {
            tail = (tail +1)%SIZE;
        }
        elements[tail] = data;
    }

    public T dequeue() {
        if(isEmpty()) {
            throw new QueueUnderflowException();
        }
        T element = elements[head];
        if(head == tail) {
            head = SPECIAL_EMPTY_INDICATOR;
        } else {
            head = (head+1)%SIZE;
        }
        return element;
    }

}