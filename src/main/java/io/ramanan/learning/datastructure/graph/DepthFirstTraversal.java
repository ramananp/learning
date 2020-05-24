package io.ramanan.learning.datastructure.graph;

import java.util.List;

import io.ramanan.learning.datastructure.graph.Graph.GraphType;

public class DepthFirstTraversal {
    
    private static void traverse(Graph graph, int[] visited, int vertex) {
        if(visited[vertex] == 1) {
            return;
        }
        visited[vertex] = 1;
        List<Integer> adjacentVertices = graph.getAdjacentVertices(vertex);
        for(Integer adjacentVertex : adjacentVertices) {
            traverse(graph, visited, adjacentVertex);
        }
        System.out.print(vertex + "->");

        for(int i=0; i < visited.length; i++) {
            traverse(graph, visited, i);
        }
    }

    public static void main(String[] args) {
        Graph graph = new AdjacentMatrixGraph(7, GraphType.DIRECTED);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 4);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);
        graph.addEdge(4, 3);
        graph.addEdge(5, 6);
        traverse(graph, new int[7], 0);
        System.out.println();
    }

}