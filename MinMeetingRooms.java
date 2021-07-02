import java.util.*;

class Solution {
    public int minMeetingRooms(int[][] intervals) {
       PriorityQueue<Integer> pq = new PriorityQueue();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int count = 0; 
        for(int[] arr : intervals) {
            if(!pq.isEmpty() && pq.peek() <= arr[0]) {
                pq.remove();
                pq.offer(arr[1]);
            } else {
                pq.offer(arr[1]);
                count++;
            }
        }
        
        return count;
    }
}
