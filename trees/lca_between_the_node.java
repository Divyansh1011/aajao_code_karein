public class lca_between_the_node {
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

        Node p = new Node(4);
        Node q = new Node(10);





        Node res = lca(root,p,q );
        System.out.println(res);
    }

    private static Node lca(Node root, Node p, Node q) 
    {
        if(root==null || root == p || root == q )
        {
            return root;
        }
        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);

        if(left == null)
        {
            return right;

        }
        else if(right == null)
        {
            return left;
        }
        else
        {
            return root;
        }

       
    }
}


/*Approach notes 
 * Brute Force; TO TRAVERSE THE GIVEN TWO NODES FROM ROOT TO THE TAIL ONE BY ONE AND SOTRING THEM UNDER THE ARRAYLIST WILL TAKE EXTRA AUXILLARY SPACE 
 */