package io.ramanan.learning.sorting;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Helper {

    public static void print(int[] array) {
        String value = IntStream.of(array)
                         .mapToObj(Integer::toString)
                         .collect(Collectors.joining(", "));
        System.out.println(value);
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}