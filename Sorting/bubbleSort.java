package Progress.Sorting;

public class bubbleSort {
    public static void bubbleSorting(int []nums){
        int sizeOfNums = nums.length;
        for(int i=0; i<sizeOfNums; i++){
            boolean isChecked = true;
            for(int j=0; j<sizeOfNums-i-1; j++){
                if(nums[j]>nums[j+1]){
                    isChecked = false;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            if(isChecked){
                break;
            }
        }
    }
    public static void print(int []nums){
        for (int i : nums) {
            System.out.print(i+"\t");
        }
    }
    public static void main(String[] args) {
        int []nums = {2,5,6,4,2,1,0};
        bubbleSorting(nums);
        print(nums);
    }
}
