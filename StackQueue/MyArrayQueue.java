package Progress.StackQueue;

public class MyArrayQueue implements IStackQueue{
    private int[] array;
    private int size;
    private int headIndex;
    private int tailIndex;

    MyArrayQueue(int size){
        this.size = size;
        array = new int[size];
        this.headIndex = this.tailIndex = -1;
    }
    @Override
    public boolean push(int value) {
        if(!isFull()){
            if(isEmpty()){
                headIndex++;
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if(!isEmpty()){
            value = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex){
                headIndex = tailIndex = -1;
            }
        }
        return 0;
    }

    @Override
    public boolean isFull() {
        return tailIndex == size-1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex == -1) && (tailIndex == -1);
    }
    public int count(){
        if(isEmpty()){
            return 0;
        }
        return tailIndex - headIndex + 1;
    }
    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Empty queue");
        } else {
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        
    }
    
}
