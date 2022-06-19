

public class diamete_of_tree {

    public static int diameter(Node root) {

        int res[] = new int[1];
        height(res,root);
        
        return res[0];
    }
    private static int height(int[] res, Node root) 
    {
        if(root == null)
        {
            return 0;
        }

        int lh = height(res, root.left);
        int rh = height(res, root.right);

        res[0] = Math.max(res[0], lh+rh
        +1);

        return 1 + Math.max(lh, rh);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int diameter = diameter(root);

        System.out.println(diameter);
    }


}

