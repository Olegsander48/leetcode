class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }
        k = k % nums.length;
        int[] newNums = new int[nums.length];
        System.arraycopy(nums, 0, newNums, 0, nums.length);
        for (int i = 0; i < k; i++) {
            nums[i] = newNums[nums.length - k + i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            nums[k + i] = newNums[i];
        }
    }
}