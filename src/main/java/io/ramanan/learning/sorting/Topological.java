package io.ramanan.learning.sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.ramanan.learning.datastructure.graph.AdjacentMatrixGraph;
import io.ramanan.learning.datastructure.graph.Graph;
import io.ramanan.learning.datastructure.graph.Graph.GraphType;
import io.ramanan.learning.datastructure.queue.Queue;

public class Topological {

    private static List<Integer> sort(Graph graph) {
        Queue<Integer> queue = new Queue<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<graph.getNumVertices(); i++) {
            int indergee = graph.getIndegree(i);
            map.put(i, indergee);
            if(indergee == 0) {
                queue.enqueue(indergee);
            }
        }

        List<Integer> sortedList = new ArrayList<>();
        while(!queue.isEmpty()) {
            int vertex = queue.dequeue();
            sortedList.add(vertex);
            List<Integer> adjacentVertices = graph.getAdjacentVertices(vertex);
            for(int currentVertex : adjacentVertices) {
                int updatedIndegree = map.get(currentVertex) - 1;
                map.put(currentVertex, updatedIndegree);
                if(updatedIndegree == 0) {
                    queue.enqueue(currentVertex);
                }
            }
        }

        if(sortedList.size() != graph.getNumVertices()) {
            throw new RuntimeException("The graph is a cyclic graph");
        }
        return sortedList;
    }
    
    public static void main(String[] args) {
        Graph graph = new AdjacentMatrixGraph(5, GraphType.DIRECTED);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 4);
        graph.addEdge(4, 1);
        graph.addEdge(1, 3);
        graph.addEdge(4, 3);
        List<Integer> sortedList = sort(graph);
        System.out.println(sortedList);
    }

}