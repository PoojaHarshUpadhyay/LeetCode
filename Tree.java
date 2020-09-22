package com.company;

import java.util.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
    }

    //insert a data
    void insert(int val) {
        if (data <= val) {
            if (left == null) {
                left = new Node(val);
            } else {
                left.insert(val);
            }
        } else {
            if(right == null) {
                right = new Node(val);
            } else {
                right.insert(val);
            }
        }
    }

    //pre order traversal
    void preorder() {
        System.out.println(data);
        if(left != null) {
            left.preorder();
        }
        if (right != null) {
            right.preorder();
        }
    }

    //in order traversal
    void inorder() {
        if(left != null) {
            left.inorder();
        }
        System.out.println(data);
        if (right != null) {
            right.inorder();
        }
    }

    //post order traversal
    void postorder() {
        if(left != null) {
            left.postorder();
        }
        if(right != null) {
            right.postorder();
        }
        System.out.println(data);
    }

}

public class Main {
    public static void main(String[] args) {
        Node node = new Node(6);
        node.insert(2);
        node.insert(7);
        System.out.println("Pre order traversal");
        node.preorder();

        System.out.println("In order traversal");
        node.inorder();

        System.out.println("Post order traversal");
        node.postorder();
    }
}
