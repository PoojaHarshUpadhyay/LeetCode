class Solution {
    public int[] twoSum(int[] nums, int target) {
       if(nums.length < 0){
           return null;
       }
      HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if(map.containsKey(sum)) {
                int val = map.get(sum);
                result[0] = val;
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        
        return result;
    }
}
