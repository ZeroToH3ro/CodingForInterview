package Progress.Graph;

import java.util.HashSet;
import java.util.Set;

public class Dijkstra {
    public static void main(String[] args) {
        int n = 5;
        int[][]graph = {{0,6,0,1,0},
                        {6,0,5,2,2},
                        {0,5,0,0,5},
                        {1,2,0,0,1},
                        {0,2,5,1,0}};
        Set<Integer>visited = new HashSet<Integer>();
        //distance[i]: range from start to i
        int []distance = new int [n];
        //previous[i]: previouse point of index i
        int []previous = new int [n];
        //declare 
        int start = 0;
        int finish = 2;
        int infinity = Integer.MAX_VALUE;
        //STEP1: create distance  
        for(int i=0; i<n; i++){
            distance[i] = infinity;
        }
        distance[start] = 0;

        while(visited.size() < n){
            //step 2: select unmarked points
            int markedPoint = 0;
            int minDistance = infinity;
            for(int i=0; i<n; i++){
                if(visited.contains(i) == false && distance[i] < minDistance){
                    minDistance = distance[i];
                    markedPoint = i;
                }
            }
            //step 3: from start point to unmarked point
            for(int i=0; i<n; i++){
                if(visited.contains(i) == false && graph[markedPoint][i] != 0){
                    int newDistance = distance[markedPoint] + graph[markedPoint][i];
                    if(newDistance < distance[i]){
                        distance[i] = newDistance;
                        previous[i] = markedPoint;
                    }
                }
            }
            //step 4: marked start point to markedPoint
            visited.add(markedPoint);
        }
        System.out.println("Min distance from "+start+" to " + finish + ": " + distance[finish]);
        int run = finish;
        while(run != start){
            System.out.print(run + " <- ");
            run = previous[run];
        }
        System.out.println(run);
    }    
}
