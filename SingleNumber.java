class Solution {
    public int singleNumber(int[] nums) {
        int res = 0; 
        if(nums.length == 0) {
            return 0; 
        }
        if( nums.length == 1) {
            return nums[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int count = 1;
            if(map.containsKey(nums[i])) {
                count = map.get(nums[i]);
                count = count+1;
                map.put(nums[i], count);
            } else {
                map.put(nums[i], count);
            }
        }
        for(Integer key : map.keySet()) {
            int val = map.get(key);
            if(val == 1) {
                res = key;
                break;
            }
        }
        return res;
    }
}
