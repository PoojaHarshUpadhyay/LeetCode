import java.util.*;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) {
            return null;
        }
        Hashtable<Node, Node> map = new Hashtable<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        map.put(node, createNode(node.val));
        
        while(!queue.isEmpty()) {
            Node currNode = queue.remove();
                for(Node neighbor: currNode.neighbors) {
                    if(!map.containsKey(neighbor)) {
                        map.put(neighbor, createNode(neighbor.val));
                        queue.add(neighbor);
                        }
                    map.get(currNode).neighbors.add(map.get(neighbor));
                    }
            }
        
        return map.get(node);
    }
    
  private  Node createNode(int val) {
        Node newNode = new Node(val);
        newNode.neighbors = new ArrayList<>();
        return newNode;
    }
}
