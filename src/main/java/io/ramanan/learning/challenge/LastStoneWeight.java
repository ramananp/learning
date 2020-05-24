package io.ramanan.learning.challenge;

import java.util.Collections;
import java.util.PriorityQueue;

class LastStoneWeight {
    /*public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones) {
            queue.offer(stone);
        }
        int result = 0;
        Integer stone = 0;
        while((stone = queue.poll()) != null) {
            result = Math.abs(result - stone);
        }
        return result;
    }*/
    public static int lastStoneWeight(int[] stones) {
        if(stones == null || stones.length == 0) {
            return 0;
        }
        if(stones.length == 1) {
            return stones[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones) {
            queue.offer(stone);
        }
        while(queue.size() > 1) {
            int first = queue.poll();
            int second = queue.poll();
            if(first != second) {
                int newStone = Math.abs(first-second);
                queue.offer(newStone);
            }
        }
        return queue.size() == 1? queue.poll():0;
        
    }

    public static void main(String[] args) {
        int[] stones = {316,157,73,106,771,828,46,212,926,604,600,992,71,51,477,869,425,405,859,924,45,187,283,590,303,66,508,982,464,398};
        System.out.println(lastStoneWeight(stones));
    }
}