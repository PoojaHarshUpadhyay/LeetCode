class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0) {
            return;
        }
        
        for(int i = 0, j = 0; j < nums.length; j++) {
            if(nums[j] != 0 ) {
                // do swapping
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j] = temp;
            }
        }
    }
}
