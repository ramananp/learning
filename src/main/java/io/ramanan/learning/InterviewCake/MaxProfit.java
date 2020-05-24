package io.ramanan.learning.InterviewCake;

public class MaxProfit {

    private static int getMaxProfit(int[] stockPrices) {
        if(stockPrices == null || stockPrices.length == 0 || stockPrices.length == 1) {
            throw new RuntimeException();
        }

        // calculate the max profit
        int maxProfit = stockPrices[1] - stockPrices[0];
        int minPrice = stockPrices[0];
        for(int i=1; i<stockPrices.length; i++) {
            int profit = stockPrices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, stockPrices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(getMaxProfit(new int[] {10,  7, 5, 8, 11, 9}));
        System.out.println(getMaxProfit(new int[] {1, 5, 3, 2}));
        System.out.println(getMaxProfit(new int[] {1, 1, 1, 1, 1}));
        System.out.println(getMaxProfit(new int[] {9, 8, 7, 4}));
    }

}