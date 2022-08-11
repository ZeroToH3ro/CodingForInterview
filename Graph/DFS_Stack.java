package Progress.Graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS_Stack {
    public static void main(String[] args) {
        int[][] graph = {{0,1,0,0,0,0,0},
                        {1,0,1,1,1,0,0},
                        {0,1,0,0,0,1,0}, 
                        {0,1,0,0,0,1,1},
                        {0,0,1,1,0,0,0},
                        {0,0,0,1,1,0,0},  
                    };
        //declare
        Stack <Integer> stack = new Stack<Integer>();
        Set<Integer> checkScan = new HashSet<Integer>();
        //Create
        stack.add(0);
        checkScan.add(0);
        //Scan stack
        while(!stack.isEmpty()){
            int u = stack.pop();
            //process u 
            System.out.println(u + " ");
            //add all edges near u
            for(int v = 0; v <graph.length; ++v){
                if(graph[u][v] == 1 && checkScan.contains(v) == false){
                    stack.add(v);
                    //mark v
                    checkScan.add(v);
                } 
            }
        }
    }
}
