class Solution {
    public int missingNumber(int[] nums) {
        int numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
        }
        int fullNumsSum = 0;
        for (int i = 1; i<= nums.length; i++) {
            fullNumsSum += i;
        }
        return fullNumsSum - numsSum;
    }
}