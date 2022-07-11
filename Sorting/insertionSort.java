package Progress.Sorting;

public class insertionSort {
    public static void insertionSorting(int []nums){
        for(int i=1; i<nums.length; i++){
            int temp = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>temp){
                //move i 
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }
    }
    public static void print(int []nums){
        for (int i : nums) {
            System.out.print(i+"\t");
        }
    }
    public static void main(String[] args) {
        int []nums = {2,5,6,4,2,1,0};
        insertionSorting(nums);
        print(nums);
    }
}
