package io.ramanan.learning.datastructure.graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacentSetGraph implements Graph {

    private final List<Node> vertexList = new ArrayList<>();
    private GraphType graphType = GraphType.DIRECTED;
    private final int numVertices;

    public AdjacentSetGraph(int numVertices, GraphType graphType) {
        this.numVertices = numVertices;
        this.graphType = graphType;
        for(int i = 0; i < numVertices; i++) {
            vertexList.add(new Node(i));
        }
    }

    @Override
    public void addEdge(int v1, int v2) {
        if(v1 < 0 || v1 >= numVertices || v2 < 0 || v2 >= numVertices) {
            throw new IllegalArgumentException("Invalid input");
        }

        vertexList.get(v1).addEdge(v2);
        if(graphType == GraphType.UNDIRECTED) {
            vertexList.get(v2).addEdge(v1);
        }

    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        if(v < 0 || v >= numVertices) {
            throw new IllegalArgumentException("Invalid input");
        }
        return vertexList.get(v).getAdjacentVertices();
    }
    
    @Override
    public int getIndegree(int v) {
        if(v < 0 || v >= numVertices) {
            throw new IllegalArgumentException("Invalid input");
        }
        int indegree = 0;
        for(int i = 0; i < numVertices; i++) {
            if(getAdjacentVertices(i).contains(v)) {
                indegree++;
            }
        }
        return indegree;
    }

    @Override
    public int getNumVertices() {
        return numVertices;
    }

}