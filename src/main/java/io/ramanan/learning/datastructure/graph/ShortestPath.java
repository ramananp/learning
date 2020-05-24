package io.ramanan.learning.datastructure.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.ramanan.learning.datastructure.graph.Graph.GraphType;
import io.ramanan.learning.datastructure.queue.Queue;
import io.ramanan.learning.datastructure.stack.Stack;

public class ShortestPath {

    static class DistanceInfo {
        int distance = -1;
        int lastVertex;
    }

    private static Map<Integer, DistanceInfo> buildDistanceTable(Graph graph, int source) {
        Map<Integer, DistanceInfo> distanceTable = new HashMap<>();
        for(int i=0; i<graph.getNumVertices(); i++) {
            distanceTable.put(i, new DistanceInfo());
        }

        distanceTable.get(source).distance = 0;
        distanceTable.get(source).lastVertex = source;

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(source);
        
        while(!queue.isEmpty()) {
            int currentVertex = queue.dequeue();
            List<Integer> adjacentVertices = graph.getAdjacentVertices(currentVertex);
            for(int i : adjacentVertices) {
                int currentDistance = distanceTable.get(i).distance;
                if(currentDistance == -1) {
                    currentDistance = 1 + distanceTable.get(currentVertex).distance;
                    distanceTable.get(i).distance = currentDistance;
                    distanceTable.get(i).lastVertex = currentVertex;
                    if(!graph.getAdjacentVertices(i).isEmpty()) {
                        queue.enqueue(i);
                    }
                }
            }
        }
        return distanceTable;
    }

    private static void shortestPath(Graph graph, int source, int destination) {
        Map<Integer, DistanceInfo> distanceTable = buildDistanceTable(graph, source);
        Stack<Integer> stack = new Stack<>();
        stack.push(destination);
        int previousVertex = distanceTable.get(destination).lastVertex;
        while(previousVertex != -1 && previousVertex != source) {
            stack.push(previousVertex);
            previousVertex = distanceTable.get(previousVertex).lastVertex;
        }
        if(previousVertex == -1) {
            System.out.println("No path exist from source to destination");
        } else {
            System.out.print(source);
            while(!stack.isEmpty()) {
                System.out.print("->"+stack.pop());
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new AdjacentMatrixGraph(5, GraphType.DIRECTED);
        //graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 4);
        graph.addEdge(4, 1);
        graph.addEdge(1, 3);
        //graph.addEdge(4, 3);
        shortestPath(graph, 0, 3);
        System.out.println();
    }

}