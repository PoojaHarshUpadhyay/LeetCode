import java.util.*;

// https://leetcode.com/problems/merge-intervals/discuss/365871/Java-solution
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) {
            return intervals;
        }
        
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        List<int[]> result = new ArrayList<>();
        int[] tempInterval = intervals[0];
        result.add(tempInterval);
        
        for(int[] interval: intervals) {
            if(tempInterval[1] >= interval[0]) {
                tempInterval[1] = Math.max(tempInterval[1], interval[1]);
            } else {
                tempInterval = interval; 
                result.add(tempInterval);
            }
        }
        
        return result.toArray(new int[result.size()][] );
    }
}
