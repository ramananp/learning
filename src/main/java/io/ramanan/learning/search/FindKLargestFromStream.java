package io.ramanan.learning.search;

import io.ramanan.learning.datastructure.heap.MinHeap;

public class FindKLargestFromStream {
 
    private static void findKLargest(int size, int[] values) {
        MinHeap<Integer> heap = new MinHeap<>(Integer.class, size);
        for(int value : values) {
            if(heap.isEmpty() || !heap.isFull()) {
                heap.insert(value);
            } else if (heap.getHighestPriority() < value) {
                if(heap.isFull()) {
                    heap.removeHighestPriority();
                }
                heap.insert(value);
            }
        }
        heap.print();
    }

    public static void main(String[] args) {
        
        int[] value = {5, 8, 6, 12, 9, 1, 13, 2, 16, 11};
        findKLargest(5, value);
    }

}