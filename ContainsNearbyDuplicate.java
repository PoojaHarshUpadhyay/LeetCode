class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if ((i - hashMap.get(nums[i])) <= k) {
                    return true;
                }
            }
                            hashMap.put(nums[i], i);

        }
        return false;
    }
}
