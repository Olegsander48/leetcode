class Solution {
    public int[] plusOne(int[] digits) {
                int[] result = new int[digits.length + 1];
        for (int i = 0; i < digits.length; i++) {
            result[result.length - 1 - i] = digits[digits.length - i - 1];
        }
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] == 9) {
                result[i] = 0;
            } else {
                result[i]++;
                break;
            }
        }
        if (result[0] == 0) {
            System.arraycopy(result, 1, digits, 0, result.length - 1);
            return digits;
        }
        return result;
    }
}