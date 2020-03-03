class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0) {
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] != 0 && nums[i] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
