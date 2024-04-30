package DSA.BinarySerachTree;

import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class BSTOrNot {
    private static class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    public BSTOrNot() {

    }

    private Node root;

    //insert elements

    public void populate(Scanner scanner){
        System.out.println("Enter the root node to be inserted");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);

    }
    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter left of " +node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to be inserted");
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter right of " +node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to be inserted");
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }

    public void display()
    {
        display(root,"");
    }
    private void display(Node node,String indent)
    {
        if(node!=null)
        {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BSTOrNot tree=new BSTOrNot();
        tree.populate(scanner);
        tree.display();
    }





}
