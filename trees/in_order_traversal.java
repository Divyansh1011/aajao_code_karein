public class in_order_traversal {
    private static void in_order(Node root)
    {
        if(root == null)
        {
            return ;
        }
        in_order(root.left);
        System.out.println(
            root.data
        );
        in_order(root.right);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        in_order(root);

    }


}
