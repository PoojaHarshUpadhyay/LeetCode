class KthLargest {

    int k;
    List<Integer> lst = new ArrayList<>();
    
    public KthLargest(int k, int[] nums) {
        this.k = k; 
        for(int i = 0; i < nums.length; i++) {
            lst.add(nums[i]);
        }
    }
    
    public int add(int val) {
        lst.add(val);
        Collections.sort(lst);
        int temp = lst.get(lst.size()-k);
        return temp;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
