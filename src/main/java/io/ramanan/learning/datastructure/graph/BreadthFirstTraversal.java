package io.ramanan.learning.datastructure.graph;

import java.util.List;

import io.ramanan.learning.datastructure.graph.Graph.GraphType;
import io.ramanan.learning.datastructure.queue.Queue;

public class BreadthFirstTraversal {

    private static void traverse(Graph graph, int[] visited, int vertex) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(vertex);
        while(!queue.isEmpty()) {
            int currentVertex = queue.dequeue();
            if(visited[currentVertex] == 1) {
                continue;
            }
            System.out.print(currentVertex + "->");
            visited[currentVertex] = 1;
            List<Integer> adjacentVertices = graph.getAdjacentVertices(currentVertex);
            for(int v : adjacentVertices) {
                if(visited[v] != 1) {
                    queue.enqueue(v);
                }
            }
        }

        for(int i = 0; i < visited.length; i++) {
            if(visited[i] != 1) {
                traverse(graph, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new AdjacentMatrixGraph(7, GraphType.UNDIRECTED);
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