/**
 * post_order_traversal
 */
public class post_order_traversal {

     static void post_order(Node root) 
    {
        if(root == null)
        {
                return;
        }

        post_order(root.left);
        post_order(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        post_order(root);
    }

}