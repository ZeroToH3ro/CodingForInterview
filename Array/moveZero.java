package Progress.Array;

public class moveZero {
    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int end = 0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i] != 0){
                int temp = nums[end];
                nums[end++] = nums[i];
                nums[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int []nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
