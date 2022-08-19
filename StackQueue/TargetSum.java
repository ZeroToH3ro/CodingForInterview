package Progress.StackQueue;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum < target || (sum - target) % 2 == 0) return 0;
        return findTargetSumWays(nums, 0,(sum - target) % 2);
    }
    public int findTargetSumWays(int[] nums, int i, int target){
        if(target < 0)
            return 0;
        if(i == nums.length)
            return target == 0  ? 0:1;
        return findTargetSumWays(nums, i + 1, target) + findTargetSumWays(nums, i + 1, target - nums[i]);
    }
}
