package Progress.Array;

public class SquareOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int []result = new int[n];
        int positive_index = 0;
        int count = 0;
        while(positive_index<n && nums[positive_index]<0){
            positive_index++;
        }
        int negative_index = positive_index-1;
        while(negative_index>=0 && positive_index<n){
            if(nums[negative_index]*nums[negative_index] < nums[positive_index]*nums[positive_index]){
                result[count] = nums[negative_index]*nums[negative_index];
                negative_index--;
            } else {
                result[count] = nums[positive_index]*nums[positive_index];
                positive_index++;
            }
            count++;
        }
        while(negative_index >= 0){
            result[count] = nums[negative_index]*nums[negative_index];
            negative_index--;
            count++;
        }
        while(positive_index < n){
            result[count] = nums[positive_index]*nums[positive_index];
            positive_index++;
            count++;
        }
        return result;
    }
    public static void main(String[] args) {
        int []nums = {-4,-1,0,3,10}; 
        for (int i : sortedSquares(nums)) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
