package io.ramanan.learning.datastructure.heap;

public class MinHeap<T extends Comparable<T>> extends Heap<T> {

    public MinHeap(Class<T> clazz) {
        super(clazz);
    }

    public MinHeap(Class<T> clazz, int size) {
        super(clazz, size);
    }

    @Override
    public void siftDown(int index) {
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);

        int smallerIndex = -1;
        if(leftIndex != -1 && rightIndex != -1) {
            smallerIndex = getElementAtIndex(leftIndex).compareTo(getElementAtIndex(rightIndex)) < 0 ? leftIndex : rightIndex;
        } else if(leftIndex != -1) {
            smallerIndex = leftIndex;
        } else if(rightIndex != -1) {
            smallerIndex = rightIndex;
        }

        if(smallerIndex == -1) {
            return;
        }

        if(getElementAtIndex(smallerIndex).compareTo(getElementAtIndex(index)) < 0) {
            swap(smallerIndex, index);
            siftDown(smallerIndex);
        }

    }

    @Override
    public void siftUp(int index) {
        int parentIndex = getParent(index);

        if(parentIndex != -1 && getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) < 0) {
            swap(parentIndex, index);
            siftUp(parentIndex);
        }
    }

}