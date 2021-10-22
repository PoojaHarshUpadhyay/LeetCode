import java.time.ZonedDateTime;

class HitCounter {

    int time = 300; 
    Queue<Integer> queue; 
    int counter = 0;
    
    public HitCounter() {
        queue = new LinkedList<>();
        
    }
    
    public void hit(int timestamp) {
        queue.add(timestamp);
        
    }
    
    public int getHits(int timestamp) {
       while(!queue.isEmpty()) {
           int diff = timestamp - queue.peek();
           if(diff >= 300) {
               queue.remove();
           } else {
               break;
           }
       }
        return queue.size();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
