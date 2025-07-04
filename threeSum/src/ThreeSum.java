import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // 先排序
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // 跳过重复值
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            // 取目标值为-nums[i]
            int target = -nums[i];
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left - 1] == nums[left]) {
                        left++;
                    }
                    while (left < right && nums[right + 1] == nums[right]) {
                        right--;
                    }
                } else {
                    if (nums[left] + nums[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}
