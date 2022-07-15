package Progress.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCalls {
    private Queue<Integer> recentCalls = new LinkedList<Integer>();
    
    public int ping(int t) {
        recentCalls.add(t);
        
        while(recentCalls.peek() < (t-3000)){
            recentCalls.remove();
        }
        return recentCalls.size();
    }
}
