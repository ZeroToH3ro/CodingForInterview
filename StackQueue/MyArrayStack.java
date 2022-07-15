package Progress.StackQueue;

public class MyArrayStack implements IStackQueue{
    private int[] array;
    private int size;
    private int topIndex;

    MyArrayStack(int size){
        this.size = size;
        array = new int[size];
        topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(!isEmpty()){
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == size -1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        } else {
            for(int i = 0; i <= topIndex; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println("");
        }
    }
}
