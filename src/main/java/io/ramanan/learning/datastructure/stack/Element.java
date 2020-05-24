package io.ramanan.learning.datastructure.stack;

public class Element<D> {

    private D data;
    private Element<D> next;

    public Element(D data, Element<D> next) {
        this.data = data;
        this.next = next;
    }

    public D getData(){
        return this.data;
    }

    public Element<D> getNext() {
        return this.next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

}