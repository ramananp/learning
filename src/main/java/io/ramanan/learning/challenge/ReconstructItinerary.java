package io.ramanan.learning.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ReconstructItinerary {
    public static List<String> findItinerary(List<List<String>> tickets) {
        if(tickets == null || tickets.size() == 0) {
            return null;
        }
        Map<String, PriorityQueue<String>> ticketMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(List<String> ticket : tickets) {
            PriorityQueue<String> heap = ticketMap.getOrDefault(ticket.get(0), new PriorityQueue<String>());
            heap.offer(ticket.get(1));
            ticketMap.put(ticket.get(0), heap);
        }
        System.out.println(ticketMap);
        PriorityQueue<String> to = ticketMap.get("JFK");
        result.add("JFK");
        while(!to.isEmpty()) {
            String des = to.poll();
            result.add(des);
            to = ticketMap.getOrDefault(des, new PriorityQueue<String>());
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        //[["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
        List<List<String>> tickets = new ArrayList<>();
        List<String> ticket = new ArrayList<>();
        ticket.add("MUC");
        ticket.add("LHR");
        tickets.add(ticket);
        ticket = new ArrayList<>();
        ticket.add("JFK");
        ticket.add("MUC");
        tickets.add(ticket);
        ticket = new ArrayList<>();
        ticket.add("SFO");
        ticket.add("SJC");
        tickets.add(ticket);
        ticket = new ArrayList<>();
        ticket.add("LHR");
        ticket.add("SFO");
        tickets.add(ticket);
        System.out.println(findItinerary(tickets));
    }
}