package Progress.Recursion;

public class printElement {
    public static void print1(int []nums, int index){
        if(index < 0 || index >= nums.length){
            return;
        }
        System.out.print(nums[index]+" ");
        print1(nums, index+1);
    }
    public static void print2(int []nums, int index){
        if(index < 0 || index >= nums.length){
            return;
        }
        print2(nums, index+1);
        System.out.print(nums[index]+" ");    
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7,8,9};
        print1(nums, 0);
        System.out.println("");
        print2(nums, 0);
    }
}
