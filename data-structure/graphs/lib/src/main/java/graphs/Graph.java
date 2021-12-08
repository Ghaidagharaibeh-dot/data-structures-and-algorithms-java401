package graphs;

import java.util.*;

public class Graph {

    private final Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        adjVertices = new HashMap<>();
    }

    void addVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
    }

    void addEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    String printGraph() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Vertex vertex : adjVertices.keySet()) {
            stringBuilder.append(vertex);
            stringBuilder.append(adjVertices.get(vertex));
        }

        return stringBuilder.toString();
    }

    int size() {
        return adjVertices.size();
    }

    public Set<Vertex> getVertices(){
        return adjVertices.keySet();
    }

    public List<Vertex> getNeighbors(String data) {
        return adjVertices.get(new Vertex(data));
    }
}
