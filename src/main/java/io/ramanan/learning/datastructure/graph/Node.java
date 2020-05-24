package io.ramanan.learning.datastructure.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {

    private final int vertixNumber;
    private final Set<Integer> adjacencySet = new HashSet<>();

    public Node(int vertixNumber) {
        this.vertixNumber = vertixNumber;
    }

    public int getVertix() {
        return this.vertixNumber;
    }

    public void addEdge(int v) {
        adjacencySet.add(v);
    }

    public List<Integer> getAdjacentVertices() {
        List<Integer> vertices = new ArrayList<>(adjacencySet);
        Collections.sort(vertices);
        return vertices;
    }
}