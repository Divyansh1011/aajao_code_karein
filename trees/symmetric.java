public class symmetric {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        boolean t = symmertrical(root);

        System.out.println(t);

        
        
    }

    private static boolean symmertrical(Node root) {
        return root == null || isSymmetric(root.left,root.right);
    }

    private static boolean isSymmetric(Node left, Node right) 
    {
        if(left == null || right == null)
        {
                return left == right;
        }
        if(left.data !=  right.data)
        {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);

    }
}
