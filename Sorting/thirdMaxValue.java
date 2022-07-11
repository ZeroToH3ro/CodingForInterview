package Progress.Sorting;

public class thirdMaxValue {
    public static void print(long []arr){
        for (long l : arr) {
            System.out.print(l + "\t");
        }
        System.out.println(" ");
    }
    public static void insert(long[] maxArr, int val){
        int i = 0;
        while(i < maxArr.length){
            if(maxArr[i] == val){
                // cannot duplicate
                return;
            } else if (val > maxArr[i]){
                //insert value into maxArry[i]
                break;
            } else {
                i++;
            }
        }
        if(i < maxArr.length){
            for(int j = maxArr.length -2; j>=i; --j){
                maxArr[j+1] = maxArr[j];
            }
            maxArr[i] = val;
            print(maxArr);
        }
    }
    public static int thirdMaxValue(int []nums) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for(int i = 0; i < nums.length; i++){
            insert(maxArr, nums[i]);
        }
        if(maxArr[2] == Long.MIN_VALUE){
            return (int) maxArr[0];
        }
        return (int)maxArr[2];
    }
    public static void main(String[] args) {
        int []nums = {2,5,6,9,12,1,0,7};
        System.out.println(thirdMaxValue(nums));
    }
}
