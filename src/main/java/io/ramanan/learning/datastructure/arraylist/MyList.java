package io.ramanan.learning.datastructure.arraylist;

import java.util.Arrays;

public class MyList<E> {

    private final static int DEFAULT_VALUE = 5;
    private Object[] elements;
    private int index = 0;

    public MyList(){
        elements = new Object[DEFAULT_VALUE];
    }

    public void add(E element) {
        if(index == elements.length){
            addCapacity();
        }
        elements[index++] = element;
    }

    @SuppressWarnings("unchecked")
    public E get(int i){
        if(i<0 || i>=index){
            throw new IndexOutOfBoundsException("Index not found.");
        }
        return (E) elements[i];
    }

    public int size() {
        return index;
    }

    private void addCapacity(){
        elements = Arrays.copyOf(elements, elements.length*2);
    }
}