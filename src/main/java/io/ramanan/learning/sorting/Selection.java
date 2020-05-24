package io.ramanan.learning.sorting;

public class Selection {

    public static void sort(int[] array) {
        for(int i=0; i<array.length; i++) { 
            for(int j=i+1; j<array.length; j++){
                if(array[i] > array[j]){
                    Helper.swap(array, i, j);
                }
            }
            Helper.print(array);
        }
    }

    public static void main(String[] args) {
        int[] array = {4,5,6,2,1,7,10,3,8,9};
        Helper.print(array);
        sort(array);
    }
    
}