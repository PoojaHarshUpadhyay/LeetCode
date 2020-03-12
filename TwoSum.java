class Solution {
    public int[] twoSum(int[] nums, int target) {
       if(nums.length < 0){
           return null;
       }
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int[] resArray = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if(map.containsKey(sum)) {
                int index1 = map.get(sum);
                resArray[0] = index1;
                resArray[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return resArray;
    }
}
