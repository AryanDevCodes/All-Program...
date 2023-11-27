//package Trees;
//
//class Node{
//    double data;
//    Node left,right;
//    Node(double val){
//        data = val;
//        left=right=null;
//    }
//}
//
//class Trees{
//    Node root;
//    Trees(){
//        root = null;
//    }
//
//    void printPreorder(Node node){
//        if(node==null){
//            return;
//        }
//        System.out.print(node.data+" ");
//
//        printPreorder(node.left);
//        printPreorder(node.right);
//    }
//
//    public static void main(String[] args) {
//
//        Trees t  =new Trees();
//        t.root = new Node(8);
//        t.root.left = new Node(6);
//        t.root.right = new Node(9);
//        t.root.left.left = new Node(5);
//        t.root.left.right = new Node(7);
//        t.root.right.right = new Node(10);
//        t.root.right.left = new Node(8.5);
//        System.out.println("Preorder Traversal Of Tree is : ");
//        t.printPreorder(t.root);
//
//    }
//}
