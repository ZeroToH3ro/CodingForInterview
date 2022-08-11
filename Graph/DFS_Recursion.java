package Progress.Graph;

import java.util.HashSet;
import java.util.Set;

public class DFS_Recursion {
    public static void DFS(int u, int [][]graph, Set<Integer> visited){
        //process u 
        System.out.println(u + " ");

        for(int v = 0; v < graph.length; ++v){
            if(graph[u][v] == 1 && visited.contains(v) == false){
            visited.add(v);
            DFS(v, graph, visited);
            }
        }
    }
    public static void main(String[] args) {
        int[][] graph = {{0,1,0,0,0,0,0},
                        {1,0,1,1,1,0,0},
                        {0,1,0,0,0,1,0}, 
                        {0,1,0,0,0,1,1},
                        {0,0,1,1,0,0,0},
                        {0,0,0,1,1,0,0},  
                    };
        //declare
        Set<Integer> checkScan = new HashSet<Integer>();
        checkScan.add(0);
        
        DFS(0, graph, checkScan);

    }
    
}
