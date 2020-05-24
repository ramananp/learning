package io.ramanan.learning.search;

import io.ramanan.learning.datastructure.heap.MinHeap;

public class FindLargestInMinHeap {

    private static int findLargest(MinHeap<Integer> heap) {
        int lastIndex = heap.getCount() -1 ;
        int lastParentIndex = heap.getParent(lastIndex);

        int firstLeaf = lastParentIndex + 1;
        int max = heap.getElementAtIndex(firstLeaf);
        for(int i = firstLeaf; i<lastIndex; i++) {
            if(max < heap.getElementAtIndex(i)){
                max = heap.getElementAtIndex(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        MinHeap<Integer> heap = new MinHeap<>(Integer.class);
        heap.insert(5);
        heap.insert(6);
        heap.insert(7);
        heap.insert(3);
        heap.insert(9);
        heap.insert(1);
        heap.insert(4);
        heap.insert(20);
        heap.insert(8);
        int max = findLargest(heap);
        System.out.println(max);
    }

}