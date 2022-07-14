package Progress.BigONation;

public class moveZerosLeetCode {
    //way 1: space complexity 0(n)
    public static void moveZero1(int nums[]){
        int n = nums.length;
        int []store = new int [n];
        int indexStore = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                store[indexStore] = nums[i];
                indexStore++;
            }
        }
        for (int i : store) {
            System.out.print(i + "\t");
        }
    }
    //way2: space complexity 0(1)
    public static void moveZero2(int nums[]){
        int n = nums.length;
        int end = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[end];
                nums[end++] = nums[i];
                nums[i] = temp;
            }
        } 
        for (int i : nums) {
            System.out.print(i + "\t");
        }
    }
    public static void main(String[] args) {
        int []nums = {1,0,9,3};
        moveZero1(nums);
        System.out.println("");
        moveZero2(nums);
    }
}