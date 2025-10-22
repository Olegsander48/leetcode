/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) { //leave when low equal right
            int mid = low + ((high - low) / 2);
            if (isBadVersion(mid)) {
                high = mid; //because it is already bad version and could be answer
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}