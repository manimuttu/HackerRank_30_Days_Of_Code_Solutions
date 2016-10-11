import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution{
	static void levelOrder(Node root){
      //Write your code here
    Queue<Node> q = new LinkedList<>();
    
    // Enqueue current root
    if(root != null) {
        q.add(root);
    }
    
    // While there are nodes to process
    while(q != null) {
        // Dequeue next node
        Node tree = q.remove();
        
        System.out.print(tree.data + " ");
        
        // Enqueue child elements from next level in order
        if(tree.left != null) {
            q.add(tree.left);
        }
        if(tree.right != null) {
            q.add(tree.right);
        }
    }
}

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}