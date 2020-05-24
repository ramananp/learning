package io.ramanan.learning.challenge;

public class OnlineStockSpan {

    private int[] prices;
    private int[] spans;
    private int index = -1;
    public OnlineStockSpan() {
        prices = new int[10000];
        spans = new int[10000];
    }
    
    public int next(int price) {
        int span = 1;
        for(int i=index; i>=0;) {
            if(prices[i] <= price) {
                span += spans[i];
                i -= spans[i];
            } else {
                break;
            }
        }
        index++;
        prices[index] = price;
        spans[index] = span;
        return span;
    }

    public static void main(String[] args) {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        System.out.print(stockSpan.next(100));
        System.out.print(" ");
        System.out.print(stockSpan.next(80));
        System.out.print(" ");
        System.out.print(stockSpan.next(60));
        System.out.print(" ");
        System.out.print(stockSpan.next(70));
        System.out.print(" ");
        System.out.print(stockSpan.next(60));
        System.out.print(" ");
        System.out.print(stockSpan.next(75));
        System.out.print(" ");
        System.out.print(stockSpan.next(70));
        System.out.println();
    }
    
}