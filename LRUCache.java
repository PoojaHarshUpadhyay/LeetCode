import java.util.*;

class LRUCache{

    int cap; 
    LinkedHashMap<Integer, Integer> map;
    
    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new LinkedHashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) {
           return -1; 
        }
        int val = map.get(key);
        map.remove(key);
        map.put(key, val);
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            map.remove(key);
            map.put(key, value);
        } else  {
            if (map.size() == cap) {
            Map.Entry<Integer,Integer> entry = map.entrySet().iterator().next();
            map.remove(entry.getKey());
            map.put(key, value);
        } else {
                map.put(key, value);
            }
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
