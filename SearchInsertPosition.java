class Solution {
    public int searchInsert(int[] nums, int target) {
      if (nums == null || target == 0) {
      return 0;
    }

    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      if (target <= nums[i]) {
        res = i;
        break;
      }
      res++;
    }
    return res;  
    }
}
