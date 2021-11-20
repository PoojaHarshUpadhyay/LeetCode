class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int j = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            } 
        }
        
        return j+1;
    }
}


class Solution {
    public int removeDuplicates(int[] nums) {
         int res = 0;
        int i = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            if (!set.contains(nums[j])) {
                set.add(nums[j]);
                nums[i] = nums[j];
                i++;
                res++;
            }
        }
        return res;
    }
}
