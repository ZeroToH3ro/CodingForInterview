package Progress.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraverse {
    private int node; //total number of nodes in the graph;
    private LinkedList<Integer> adj[]; //adjacency list
    private Queue<Integer>que;
    public BFSTraverse(int v){
        this.node = v;
        adj = new LinkedList[node];
        for(int i = 0; i<v; ++i){
            adj[i] = new LinkedList<>();
        }
        this.que = new LinkedList<Integer>();
    }
    //insert edges into graph
    void insertEdge(int v, int w){
        adj[v].add(w);
    }
    void BFS(int n){
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[n] = true;
        que.add(n);
        while(que.size() != 0){
            n = que.poll();
            System.out.print(n + " ");
            for(int i=0; i<adj[n].size(); ++i){
                a = adj[n].get(i);
                System.out.println("\na: "+a);
                //check nodes is visited
                if(!nodes[a]){
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }
    public static void main(String[] args) {
        BFSTraverse graph = new BFSTraverse(6);  
        graph.insertEdge(0, 1);  
        graph.insertEdge(0, 3);  
        graph.insertEdge(0, 4);  
        graph.insertEdge(4, 5);  
        graph.insertEdge(3, 5);  
        graph.insertEdge(1, 2);  
        graph.insertEdge(1, 0);  
        graph.insertEdge(2, 1);  
        graph.insertEdge(4, 1);  
        graph.insertEdge(3, 1);  
        graph.insertEdge(5, 4);  
        graph.insertEdge(5, 3);  
        System.out.println("Breadth First Traversal for the graph is:");  
        graph.BFS(0);  
        System.out.println();
    }
}
