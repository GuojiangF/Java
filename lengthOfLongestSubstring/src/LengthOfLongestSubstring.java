import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int rk = -1;
        int n = s.length();
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                set.remove(s.charAt(i-1));
            }
            while (rk + 1< n && !set.contains(s.charAt(rk+1))) {
                set.add(s.charAt(rk+1));
                rk++;
            }
            maxSize = Math.max(maxSize, set.size());
        }
        return maxSize;
    }
}
