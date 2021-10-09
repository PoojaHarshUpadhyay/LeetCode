class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0; 
        if(nums.length == 0) {
            return 0;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length ; i++) {
            int val = nums[i];
            if(map.containsKey(val)) {
                int count = map.get(val);
                count++;
                map.put(val, count);
            } else {
                map.put(val, 1);
            }
        }
        
        int n = nums.length;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int val = entry.getValue();
            if(val > n/2) {
                ans = entry.getKey();
                break;
            }
        }
        
        return ans;
        
        }
}
