import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // 去重
        for (int n: nums) {
            set.add(n);
        }
        int length =0;

        for (int n: set) {
            if (!set.contains(n - 1)) {
                int len = 1;
                int cur = n;
                while (set.contains(cur+1)) {
                    len++;
                    cur++;
                }
                length = Math.max(length, len);
            }
        }
        return length;
    }
}
