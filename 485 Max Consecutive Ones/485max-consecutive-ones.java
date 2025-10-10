class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;
            }  
                if (nums[i] == 0 || i == nums.length - 1) {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                } 
                currentCount = 0;
            }
        }
        return maxCount;
    }
}