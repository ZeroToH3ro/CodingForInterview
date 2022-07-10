package Progress.Array;

public class RemoveElement2Points {
    public static int removeElements(int nums[], int val){
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void print(int nums[]){
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
    }
    
    public static void main(String[] args) {
        int []nums = {2,5,6,6,7};
        System.out.println(removeElements(nums, 6));
    }
}