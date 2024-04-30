package DSA.LinkedLists;

public class DoblyLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
    }
    static Node head;

    static void print(Node node){
        Node last=null;
        //traversal in forward direction

        while (node!=null) {
            System.out.println(" "+node.data);
        }

    }
    static void push( int data) {
        Node new_node = new Node();
        new_node.data = data;


        new_node.next = head;
        new_node.prev = null;

        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    public static void main(String[] args) {

    }
}
