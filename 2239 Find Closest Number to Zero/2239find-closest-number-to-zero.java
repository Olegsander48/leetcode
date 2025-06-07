class Solution {
    public int findClosestNumber(int[] nums) {
        int minNum = nums[0];      
        for(int i = 1; i < nums.length; i++) {
            if(Math.abs(nums[i]) < Math.abs(minNum)) {
                minNum = nums[i];
            }
            if (nums[i] == Math.abs(minNum)) {
                minNum = nums[i];
            }
        }
        return minNum;
    }
}