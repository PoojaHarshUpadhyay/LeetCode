class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length <= 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            } else {
                map.put(nums[i], 1);
            }
        }
        int res = 0; 
        //iterate through map 
        for(Integer key : map.keySet()) {
            Integer value = map.get(key);
            if(value > nums.length/2) {
                res = key;
                break;
            }
        }
        
        return res;
    }
}
