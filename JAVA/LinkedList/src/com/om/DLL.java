package com.om;

public class DLL {

    private Node head;
    private Node tail;

    private int size;

    public DLL() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
//////////////////////////////////////////////////////////////////
    //Insert First
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.previous = null;
        head.previous = node;
        if (head != null){
            head.previous = node;
        }
        head = node;
    }
    //Insert Last

    public void insertLast(int val) {
        Node node = new Node(val);
        Node temp = head;

        node.next = null;

        if (head == null) {
            node.previous = null;
            head = node;
            return;
        }

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.previous = temp;
    }


    public void insertAtIndex(int val, int index) {
        Node node = new Node(val);
        if(index == 0) {
            node.next = head;
            node.previous = null;
            if (head != null) {
                head.previous = node;
            }
            head = node;
            return;
        }

        Node temp = head;
        for(int i =0; i< index - 1; i++) {
            if(temp == null) return;
            temp = temp.next;
        }
        node.next = temp.next;
        node.previous = temp;
        if (temp.next != null) {
            node.next.previous = node;
        }
        temp.next = node;
    }

//////////////////////////////////////////////////////////////
    public Node findIndex(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int after, int val) {
        Node temp = findIndex(after);
        if(temp == null) {
            System.out.println("does not exist");
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.previous = temp;
        if (node.next != null) {
            node.next.previous = node;
        }
    }
//////////////////////////////////////////////////////////////

    //Display
    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while (last != null) {
            System.out.println(last.value + " -> ");
            last = last.previous;
        }
        System.out.println("START");
    }
}
