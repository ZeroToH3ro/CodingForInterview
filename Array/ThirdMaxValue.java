package Progress.Array;

public class ThirdMaxValue {
    public static int thirdMax(int[] nums) {
        Integer[] largest = new Integer[3];
        for (Integer n : nums) {
            // update first max value
            if (largest[0] == null || n > largest[0]) {
                largest[2] = largest[1];
                largest[1] = largest[0];
                largest[0] = n;
                // update second max value
            } else if ((largest[1] == null || n > largest[1])
                    && (largest[0] != null && n < largest[0])) {
                largest[2] = largest[1];
                largest[1] = n;
                // update third max value
            } else if ((largest[2] == null || n > largest[2])
                    && (largest[0] != null && n < largest[0])
                    && (largest[1] != null && n < largest[1])) {
                largest[2] = n;
            }
        }
        return largest[2] == null ? largest[0] : largest[2];
    }
    
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3 };
        System.out.println(thirdMax(nums));
    }
}
