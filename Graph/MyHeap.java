package Progress.Graph;

public class MyHeap {
    private static int MAX_SIZE = 100;
    private int[] arr = new int [MAX_SIZE + 1];
    private int size = 0; 
    
    public MyHeap() {
        size = 0;
    }

    public boolean isEmpty() {
        return  size <= 0;
    }

    public int peek(){
        if(isEmpty()) return -1;
        return arr[1];
    }
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void add(int v){
        size++;
        arr[size] = v;
        //heap up 
        int curIndex = size;
        int parentIndex = curIndex / 2;

        while(parentIndex != 0 && arr[parentIndex] > arr[curIndex]){
            //swap 
            swap(arr[parentIndex], arr[curIndex]);
            curIndex = parentIndex; 
            parentIndex = curIndex / 2;
        }
    }
    public static void main(String[] args) {
        
    }
}
