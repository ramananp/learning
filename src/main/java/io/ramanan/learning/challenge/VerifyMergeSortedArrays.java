package io.ramanan.learning.challenge;

public class VerifyMergeSortedArrays {

    public static boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {

        // check if we're serving orders first-come, first-served
        int index = 0;
        int takeOutOrdersIndex = 0;
        int dineInOrdersIndex = 0;
        while(takeOutOrdersIndex < takeOutOrders.length && dineInOrdersIndex < dineInOrders.length) {
            int element = 0;
            if(takeOutOrders[takeOutOrdersIndex] < dineInOrders[dineInOrdersIndex]) {
                element = takeOutOrders[takeOutOrdersIndex];
                takeOutOrdersIndex++;
            } else {
                element = dineInOrders[dineInOrdersIndex];
                dineInOrdersIndex++;
            }
            if(servedOrders[index] != element) {
                return false;
            }
            index++;
        }
        
        while(takeOutOrdersIndex < takeOutOrders.length && index < servedOrders.length) {
            if(servedOrders[index] != takeOutOrders[takeOutOrdersIndex]) {
                return false;
            }
            takeOutOrdersIndex++;
            index++;
        }
        
        while(dineInOrdersIndex < dineInOrders.length && index < servedOrders.length) {
            if(servedOrders[index] != dineInOrders[dineInOrdersIndex]) {
                return false;
            }
            dineInOrdersIndex++;
            index++;
        }

        return index == servedOrders.length && takeOutOrdersIndex == takeOutOrders.length && dineInOrdersIndex == dineInOrders.length;
    }

    public static void main(String[] args) {
        final int[] takeOutOrders = {1, 9};
        final int[] dineInOrders = {7, 8};
        final int[] servedOrders = {1, 7, 8};
        final boolean result = isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders);
        System.out.println(result);
    }
}