package com.company;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.insert(2);
        obj.insert(3);
        obj.insert(5);
        obj.traverse();
    }

    Node head;

    public void insert(int num) {
        Node node = new Node(num);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void traverse() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
