class Solution {
    public int maxSubArray(int[] nums) {
          if (nums.length == 1) {
            return nums[0];
        }
        int curr = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(curr + nums[i], nums[i]);
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }
}
