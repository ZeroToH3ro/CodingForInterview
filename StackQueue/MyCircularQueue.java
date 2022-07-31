package Progress.StackQueue;

import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {
    //declare data, p_start and p_tail;
    private int[] data;
    private int p_head;
    private int p_tail;
    private int size;
    //declare constructor
    public MyCircularQueue(int k){
        data = new int [k];
        p_head = -1;
        p_tail = -1;
        size = k;
    }
    //insert element into queue
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(isEmpty()) p_head = 0;
        p_tail = (p_tail+1) % size;
        data[p_tail] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        if(p_head == p_tail){
            p_head = -1;
            p_tail = -1;
            return true;
        }
        p_head = (p_head + 1) % size;
        return true;
    }
    // get the front item from the queue
    public int Front() {
        if(isEmpty()) return -1;
        return data[p_head];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return data[p_tail];
    }
    
    public boolean isEmpty() {
        return p_head == -1;
    }
    
    public boolean isFull() {
        return ((p_tail+1)%size) == p_head;
    }
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(3);
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);
        obj.Rear();
        obj.isFull();
        obj.deQueue();
        obj.enQueue(4);
        obj.Rear();
    }
}
