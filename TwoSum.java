class Solution {
    public int[] twoSum(int[] nums, int target) {
         if (nums == null) {
      return null;
    }
    int[] twoNum = new int[2];
    //create a hashmap that will store key as the num[i] and value as index
    HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
    
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
    
    // calculate the difference between target and num[i]
      int value = target - nums[i];
      
      //if hashmap table contains the value then we found the solution
      //put the last value of hashmap and the latest i value in the result array i.e twoNum in our case
      if (table.containsKey(value)) {
        twoNum[index] = table.get(value);
        index++;
        twoNum[index] = i;
        break;
      }
      table.put(nums[i], i);
    }
    return twoNum;
    }
}
