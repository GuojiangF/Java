import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
            }
        });

        int[] ans = new int[n-k+1];
        for (int i = 0; i< k; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        ans[0] = pq.peek()[0];
        for (int i = k; i<n; i++) {
            pq.offer(new int[]{nums[i], i});
            while (pq.peek()[1] <= i -k) {
                pq.poll();
            }
            ans[i-k+1] = pq.peek()[0];
        }
        return ans;
    }
}
