package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Node node = new Node(1);
        node.insert(2);
        node.insert(3);

        Node node1 = new Node(1);
        node1.insert(2);
        node.insert(3);

        Node n = new Node(1);
        n.isSameTree(node, node1);
        System.out.println("HI");
    }
}

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }

    void insert(int data) {
        if (data < val) {
            if (left == null) {
                left = new Node(data);
            } else {
                left.insert(data);
            }
        } else {
            if (right == null) {
                right = new Node(data);
            } else {
                right.insert(data);
            }
        }
    }

    boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        boolean leftNode = isSameTree(p.left, q.left);
        boolean rightNode = isSameTree(p.right, q.right);
        boolean isValSame = (p.val == q.val);
        return isValSame && leftNode && rightNode;
    }
}
