class Solution {
    public int maxArea(int[] height) {
        int maxarea = Integer.MIN_VALUE; 
        for(int i = 0; i < height.length; i++) {
            int area = 0;
            for(int j = i+1; j < height.length; j++) {
                if(height[i] < height[j]) {
                    area = height[i] * (j-i);
                } else {
                    area = height[j] * (j-i);
                }
                maxarea = Math.max(maxarea, area);
            }
            
        }
        return maxarea;
    }
}
