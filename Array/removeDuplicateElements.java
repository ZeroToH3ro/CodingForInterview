package Progress.Array;

public class removeDuplicateElements {
    public static int removeDuplicates(int[] nums) {
        int N = nums.length;
        if(N == 0) return 0;
        int i=0;
        for(int j=1; j<N; ++j){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int []nums = {1,1,2};
        for (int i=0; i<removeDuplicates(nums); i++) {
            System.out.print(nums[i]+"\t");
        }
        System.out.println();
    }
}
