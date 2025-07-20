import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] s = new int[n+1];
        for (int i = 0; i< n; i++) {
            s[i+1] = s[i] + nums[i];
        }

        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>(n+1);
        for (int ss: s) {
            ans += map.getOrDefault(ss-k, 0);
            map.put(ss, map.getOrDefault(ss, 0) + 1);
        }
        return ans;
    }
}
