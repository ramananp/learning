package io.ramanan.learning.datastructure.hashmap;

public class MyHashMapTest {

    public static void main(String[] args) {
        MyHashMap<String, String> names = new MyHashMap<>();
        names.put("Hello", "Hi");
        System.out.println(names.get("Hello"));
        names.put("Hello", "Hwr");
        System.out.println(names.get("Hello"));
        names.put("Hey", "howdy");
        System.out.println(names.get("Hey"));
    }
}