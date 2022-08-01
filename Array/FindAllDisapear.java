package Progress.Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisapear {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++) {
            int idx = Math.abs(nums[i])-1;
            if(nums[idx] > 0){
                nums[idx] *= -1;
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []nums = {1 , 2 , 5 , 6 , 2 , 5};
        for (int i : findDisappearedNumbers(nums)) {
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
