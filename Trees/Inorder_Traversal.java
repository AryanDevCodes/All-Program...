package Trees;

class Node{
    double data;
    Node left,right;
    Node(double val){
        data=val;
        left=right=null;
    }
    public static class Trees1{
        Node Root;
        Trees1(){
            Root=null;
        }
        void printInorder(Node node){
            if(node==null){
                return;
            }
            printInorder(node.left);
            System.out.print(node.data+" , ");
            printInorder(node.right);
        }
    }
    public static void main(String[] args) {
        Trees1 t = new Trees1();
        t.Root = new Node(5);
        t.Root.left = new Node(4);
        t.Root.right = new Node(6);
        t.Root.left.left = new Node(3);
        t.Root.left.right = new Node(4.5);
        System.out.println("Inorder Traversal Of Tree is : ");
        t.printInorder(t.Root);
        

    }
}