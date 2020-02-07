package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        GraphNode graph = new GraphNode(5);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 4);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 1, 3);
        graph.addEdge(graph, 1, 4);
        graph.addEdge(graph, 2, 3);
        graph.addEdge(graph, 3, 4);
        graph.printGraph(graph);
    }
}

class GraphNode {
    int val;
    LinkedList<Integer> vertex[];

    GraphNode(int v) {
        val = v;
        vertex = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            vertex[i] = new LinkedList<>();
        }
    }

    void addEdge(GraphNode node, int src, int dest) {
        //since it is undirected graph we add src and dest and vice versa
        node.vertex[src].add(dest);
        node.vertex[dest].add(src);
    }

    void printGraph(GraphNode node) {
        for (int i = 0; i < node.vertex.length; i++) {
            LinkedList<Integer> currentList = node.vertex[i];
            System.out.println(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.println(currentList.get(j));
            }
            System.out.println();
        }
    }

}
