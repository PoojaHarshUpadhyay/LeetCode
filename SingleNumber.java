class Solution {
    public int singleNumber(int[] nums) {
          if (nums.length <= 0) {
            return 0;
        }
        int result = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], count);
            } else {
                int newCount = hashMap.get(nums[i]);
                newCount++;
                hashMap.replace(nums[i], newCount);
            }
        }
        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            if (e.getValue() == 1) {
                result = e.getKey();
                break;
            }
        }

        return result;
    }
}
