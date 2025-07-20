class Solution {
    public int[] runningSum(int[] nums) {
        int rise = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + rise;
            rise = nums[i];
        }
        return nums;
    }
}