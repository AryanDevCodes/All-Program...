package Trees;
import java.util.Scanner;

public class SearchingNode {
   
      Node root;
      Scanner sc = new Scanner(System.in);
    class Node{
    int data;
    Node left,right;
    public Node(int value){
        this.data=value;
        left=right=null;
    }
}
    public boolean insert(){
        int val = sc.nextInt();
        Node newNode = new Node(val);
        if(root==null){
            root = newNode;
        return true;
        }
        Node temp=root;
        while(true){
            if(newNode.data==temp.data){
                return false;
            }
            if(newNode.data<temp.data){
                if(temp.left==null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else{
                if(temp.right==null){
                temp.right = newNode;
                return true;
            }
                temp = temp.right;
          }
        }
    }
   
    public static void main(String[] args) {
        SearchingNode newNode = new SearchingNode();
        newNode.insert();
        newNode.insert();
        newNode.insert();
        newNode.insert();
        newNode.insert();
        newNode.insert();
        // System.out.println(newNode.root.left.right.data);
        newNode.insert();

    }
}

