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
       HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        map.put(node, CreateNode(node.val));
        
        while(!queue.isEmpty()){
            Node currentNode = queue.remove();
            for(Node neighbour : currentNode.neighbors) {
                if(!map.containsKey(neighbour)) {
                    map.put(neighbour, CreateNode(neighbour.val));
                    queue.add(neighbour);
                }
                map.get(currentNode).neighbors.add(map.get(neighbour));
            }
        }
        
        return map.get(node);
        
    }
    private Node CreateNode(int val) {
        Node newnode = new Node(val);
        newnode.neighbors = new ArrayList<Node>();
        return newnode;
    }
}
