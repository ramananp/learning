package io.ramanan.learning.datastructure.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacentMatrixGraph implements Graph {

    private final int[][] matrix;
    private final int numVertecis;
    private final GraphType graphType;

    public AdjacentMatrixGraph(int numVertecis, GraphType graphType) {
        this.matrix = new int[numVertecis][numVertecis];
        this.numVertecis = numVertecis;
        this.graphType = graphType;
        for(int i = 0; i < numVertecis; i++) {
            for(int j = 0; j < numVertecis; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    @Override
    public void addEdge(int v1, int v2) {
       if(v1 < 0 || v2 < 0 || v1 >= numVertecis || v2 >= numVertecis) {
           throw new IllegalArgumentException("Invalid input");
       }
       matrix[v1][v2] = 1;
       if(graphType == GraphType.UNDIRECTED) {
           matrix[v2][v1] = 1;
       }
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        if(v < 0 || v >= numVertecis) {
            throw new IllegalArgumentException("Invalid input");
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < numVertecis; i++) {
            if(matrix[v][i] == 1) {
                result.add(i);
            }
        }
        Collections.sort(result);
        return result;
    }

    @Override
    public int getIndegree(int v) {
        if(v < 0 || v >= numVertecis) {
            throw new IllegalArgumentException("Invalid input");
        }
        int indegree = 0;
        for(int i = 0; i < numVertecis; i++) {
            if(matrix[i][v] != 0) {
                indegree++;
            }
        }
        return indegree;
    }

    @Override
    public int getNumVertices() {
        return numVertecis;
    }

}