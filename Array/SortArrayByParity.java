package Progress.Array;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(nums[left] % 2 != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                left++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int []nums = {3,1,2,4};
        for (int i : sortArrayByParity(nums)) {
            System.out.print(i+"\t");
        };
        System.out.println();
    }
}
