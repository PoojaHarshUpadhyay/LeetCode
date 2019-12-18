class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 0) {
            return null;
        }
        int[] result = new int[2];
        int index = 0;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if(hashmap.containsKey(value)) {
                result[index] = hashmap.get(value);
                index++;
                result[index] = i;
            }
            hashmap.put(nums[i], i);
        }
        
        return result;
    }
}
