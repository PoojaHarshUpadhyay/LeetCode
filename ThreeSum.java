class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            int j = i+1; 
            int k = nums.length -1;
            while(j < k) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    ArrayList temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    set.add(temp);
                    j++;
                    k--;
                } else if(nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        List<List<Integer>> list = new ArrayList<>();
        for(List tt : set) {
            list.add(tt);
        }
        
        return list;
    }
}
