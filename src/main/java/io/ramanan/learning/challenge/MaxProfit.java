package io.ramanan.learning.challenge;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int result = 0;
        for(int i=1; i<prices.length; i++) {
            int diff = prices[i] - prices[i-1];
            if(diff > 0) {
                result += diff;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        //int[] prices = {7, 1, 5, 3, 6, 4};
        //int[] prices = {1, 2, 3, 4, 5};
        //int[] prices = {7,6,4,3,1};
        //int[] prices = {3, 4, 6, 2, 1};
        int[] prices = {3, 5, 4, 9, 6, 4};
        int profit = maxProfit.maxProfit(prices);
        System.out.println(profit);
    }

}