package Progress.Array;

public class RemoveElementInPlace {
    public static int removeElement(int[] nums, int val) {
        int N = nums.length;
        int i = 0;
        while(i < N){
            if(nums[i] == val){
                nums[i] = nums[N-1];
                //reduce the size of the array
                N--;
            } else {
                i++;
            }
        }
        for (int index = 0; index < N; index++) {
            System.out.print(nums[index]+ "\t");
        }
        System.out.println();
        return N;
    }
    public static void main(String[] args) {
        int []nums = {3,2,2,3};
        System.out.println(removeElement(nums, 2));
    }
}
