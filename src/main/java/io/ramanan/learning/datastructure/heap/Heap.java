package io.ramanan.learning.datastructure.heap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class Heap<T extends Comparable<T>> {

    private int count;
    private T[] array;
    private static final int MAX_SIZE = 10;

    public Heap(Class<T> clazz) {
        this(clazz, MAX_SIZE);
    }

    @SuppressWarnings("unchecked")
    public Heap(Class<T> clazz, int size) {
        array = (T[]) Array.newInstance(clazz, size);
    }

    public int getLeftChildIndex(int index) {
        int leftChildIndex = 2 * index + 1;
        if(leftChildIndex >= count) {
            return -1;
        }
        return leftChildIndex;
    }

    public int getRightChildIndex(int index) {
        int rightChildIndex = 2 * index + 2;
        if(rightChildIndex >= count) {
            return -1;
        }
        return rightChildIndex;
    }

    public int getParent(int index) {
        if(index < 0 || index >= count) {
            return -1;
        }
        return (index-1)/2;
    }

    public int getCount() {
        return this.count;
    }

    public boolean isFull() {
        return count == array.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public T getElementAtIndex(int index) {
        return array[index];
    }

    public void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public abstract void siftDown(int index);
    public abstract void siftUp(int index);

    public void insert(T data) {
        if(count >= array.length) {
            throw new RuntimeException("Heap is full");
        }
        array[count] = data;
        siftUp(count);
        count++;
    }

    public T removeHighestPriority() {
        if(count <= 0) {
            throw new RuntimeException("Heap is empty");
        }
        T data = array[0];
        array[0] = array[count - 1];
        count--;
        siftDown(0);
        return data;
    }

    public T getHighestPriority() {
        if(count <= 0) {
            throw new RuntimeException("Heap is empty");
        }
        return array[0];
    }

    public void print() {
        String print = Arrays.stream(array).map(value -> String.valueOf(value)).collect(Collectors.joining(","));
        System.out.println(print);
    }

}