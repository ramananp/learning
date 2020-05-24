package io.ramanan.learning.datastructure.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ramanan");
        names.add("Mike");
        names.add("Tom");
        names.add("Mark");
        names.add("Rich");
        System.out.println(names.size());
        names.add("Srini");
        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.pop());
        System.out.println(names);
    }
}