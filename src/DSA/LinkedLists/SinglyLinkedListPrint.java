package DSA.LinkedLists;

public class SinglyLinkedListPrint {

    static class Node{
        int data;
        Node next;
    }
    static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head=null;
        Node second=null;
        Node third=null;

        head=new Node();
        second=new Node();
        third=new Node();

        head.data=1;

        head.next=second;

        second.data=2;
        second.next=third;
        third.data=3;

        print(head);
    }
}
