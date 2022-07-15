package Progress.StackQueue;

public class MyMain {
    public static void main(String[] args) {
        MyArrayStack myStk = new MyArrayStack(3);
        MyArrayQueue myQueue = new MyArrayQueue(3);
        myStk.push(1);
        myStk.push(2);
        myStk.push(3);
        myStk.push(4);

        myStk.print();
        myStk.pop();
        myStk.print();
        
        System.out.println("\n-------\n");

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.print();
        myQueue.pop();
        myQueue.print();
    }
}
