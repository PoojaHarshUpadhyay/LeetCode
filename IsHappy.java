class Solution {
    public boolean isHappy(int n) {
        int sum = 0; 
        int rem = 0;
        for(int i = 0; i < 30; i ++) {
            
            while(n > 0) {
                rem = n%10;
                sum += rem * rem;
                n = n/10;
            }
            
            if(sum == 1) {
                return true;
            } 
            
            n = sum;
            sum = 0;
            
        }
        
        return false;
    }
}
