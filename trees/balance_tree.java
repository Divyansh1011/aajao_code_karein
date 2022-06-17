public class balance_tree {

    static int balance(Node root) 
    {
        if(root == null)
        {
            return 0;
        }
        int lh = balance(root.left);
        if(lh==-1)
        {
            return -1;
        }
        int rh = balance(root.right);
        if(rh==-1)
        {
            return -1;
        }
        if(Math.abs(lh-rh)>1)
        {
            return -1;

        }

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

        int height = balance(root);
        System.out.println(height);

    }

 
}
