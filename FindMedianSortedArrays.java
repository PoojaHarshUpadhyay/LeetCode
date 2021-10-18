class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] n3 = new int[n1+n2];
        int i = 0; 
        int j = 0;
        int k = 0; 
        double res = 0; 
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]) {
                n3[k] = nums1[i];
                i++;
            } else {
                n3[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while(i < n1 ) {
            n3[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n2) {
            n3[k] = nums2[j];
            j++;
            k++;
        }
        
            // even
            if(n3.length % 2 == 0) {
                int mid = n3.length /2;
                double v1 = n3[mid];
                double v2 = n3[mid-1];
                res = (v1 + v2)/2;
            } 
            // odd
            else {
                int mid = n3.length / 2;
                res = n3[mid];
            }
        return res;
    }
}
