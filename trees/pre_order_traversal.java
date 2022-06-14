
 class Node
 {
    int data;
    Node left;
    Node right;

   public Node(int key)
    {
        this.data = key;

    }
 }

public class pre_order_traversal {


    static void pre_order(Node root) 
    {
        if(root == null)
        {
            return;
        }

        System.out.println(root.data);
        pre_order(root.left);
        pre_order(root.right);
    }
    public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

         pre_order(root);
        
    }

}
