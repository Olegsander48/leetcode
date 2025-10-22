class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if ("X++".equals(operation) || "++X".equals(operation)) {
                result++;
            } else {
                result--;
            }
        }
        return result;
    }
}