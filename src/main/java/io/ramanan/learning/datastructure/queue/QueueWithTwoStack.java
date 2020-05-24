package io.ramanan.learning.datastructure.queue;

import io.ramanan.learning.datastructure.stack.Stack;

public class QueueWithTwoStack<T> {

    Stack<T> enqueueStack = new Stack<>();
    Stack<T> dequeueStack = new Stack<>();

    public boolean isFull() {
        return enqueueStack.isFull() || dequeueStack.isFull();
    }

    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    public T peek() {
        if(isEmpty()) {
            throw new QueueUnderflowException();
        }
        if(dequeueStack.isEmpty()) {
            while(!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.peek();
    }

    public void enqueue(T data) {
        if(isFull()) {
            throw new QueueOverflowException();
        }
        if(enqueueStack.isEmpty()) {
            while(!dequeueStack.isEmpty()) {
                enqueueStack.push(dequeueStack.pop());
            }
        }
        enqueueStack.push(data);
    }

    public T dequeue() {
        if(isEmpty()) {
            throw new QueueUnderflowException();
        }
        if(dequeueStack.isEmpty()) {
            while(!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }
}