package io.ramanan.learning.datastructure.stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        System.out.println(names.isEmpty());
        names.push("Ramanan");
        names.push("Mike");
        names.push("Tony");
        names.push("Tom");
        names.push("Jerry");
        System.out.println(names.size());
        System.out.println(names.isFull());
        System.out.println(names.pop());
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.pop());
        System.out.println(names.size());
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
    }


}