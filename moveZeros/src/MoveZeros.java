public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    private void swap(int[]nums, int left, int right) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }
}
