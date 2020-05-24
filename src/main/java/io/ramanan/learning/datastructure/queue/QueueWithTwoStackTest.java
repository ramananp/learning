package io.ramanan.learning.datastructure.queue;

public class QueueWithTwoStackTest {

    public static void main(String[] args) {
        QueueWithTwoStack<String> queue = new QueueWithTwoStack<>();
        System.out.println(queue.isEmpty());
        queue.enqueue("Ramanan");
        queue.enqueue("Mike");
        queue.enqueue("Tom");
        queue.enqueue("Rick");
        queue.enqueue("Mark");
        System.out.println(queue.peek());
        System.out.println(queue.isFull());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }
}