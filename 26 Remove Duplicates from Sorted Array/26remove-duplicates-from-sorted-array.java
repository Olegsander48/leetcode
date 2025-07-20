class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 1;
        int index = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[index] != nums[i]) {
                nums[counter] = nums[i];
                index = i;
                counter++;
            }
        }
        return counter;
    }
}