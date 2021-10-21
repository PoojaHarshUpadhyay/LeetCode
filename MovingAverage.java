import java.util.*;

class MovingAverage {

    Queue<Integer> queue = new LinkedList<>();
    double temp = 0; 
    double avg = 0; 
    int size = 0; 
    
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        if(queue.size() < size) {
            temp = temp + val; 
        } else {
            // here we remove from the queue the old value then 
            // minus it from temp value and then add new val to it
            int dequeueVal = queue.poll();
            temp = temp - dequeueVal;
            temp = temp + val; 
        }
        queue.add(val);
        avg = temp/queue.size();

        return avg; 
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
