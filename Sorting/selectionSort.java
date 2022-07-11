package Progress.Sorting;

public class selectionSort {
    public static void selectionSorting(int []nums){
        for(int i=0; i<nums.length; i++){
            int minIndex = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;   
                }
            }
            if(minIndex != i){
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
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
        selectionSorting(nums);
        print(nums);
    }
}
