class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        boolean result = false;
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                result =  true;
                break;
            } 
            set.add(nums[i]);
        }
        return result;
    }
}
