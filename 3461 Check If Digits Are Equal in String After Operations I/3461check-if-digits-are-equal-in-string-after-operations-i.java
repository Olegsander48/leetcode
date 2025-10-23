class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder builder = new StringBuilder();
        while (s.length() > 2) {
            for (int i = 0; i < s.length() - 1; i++) {
                int digit = s.charAt(i) - '0';
                int nextDigit = s.charAt(i + 1) - '0';
                builder.append((digit + nextDigit) % 10);
            }
            s = builder.toString();
            builder = new StringBuilder();
        }
        return s.charAt(0) == s.charAt(1);
    }
}