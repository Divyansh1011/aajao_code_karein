public class simillar_tree {


    private static boolean simillar(Node root, Node root1) 
    {
        if(root == null && root1 == null)
        {
            return (root == root1);
        }
        return (root.data == root1.data) && simillar(root.left, root1.left) && simillar(root.right, root1.right);
        
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right = new Node(3);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        System.out.println(
            simillar(root,root1)
        );

        
    }

}
