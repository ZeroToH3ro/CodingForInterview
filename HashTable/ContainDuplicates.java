package Progress.HashTable;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int element : nums) {
            if(set.contains(element) == true){
                return true;
            } else {
                set.add(element);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []nums = {1,1,2,1,3,4};
        System.out.println("Has duplicate elements: "+containsDuplicate(nums));
    }
}
