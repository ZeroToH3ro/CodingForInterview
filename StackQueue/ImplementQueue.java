package Progress.StackQueue;

import java.util.ArrayList;
import java.util.List;

public class ImplementQueue {
    //store elements in queue
    private List<Integer>data;
    //a pointer to indicate the start position
    private int p_start;
    //declare constructor
    public ImplementQueue(){
        data = new ArrayList<Integer>();
        p_start = 0;
    }
    //insert an element into queue
    public boolean enQueue(int x){
        data.add(x);
        return true;
    }
    //delete an element from queue
    public boolean deQueue(){
        if(isEmpty()==true){
            return false;
        }
        p_start++;
        return true;
    }
    private boolean isEmpty() {
        return p_start >= data.size();
    }
    //get the front item from the queue
    public int Front(){
        return data.get(p_start);
    }
    public static void main(String[] args) {
        ImplementQueue q = new ImplementQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }
}
