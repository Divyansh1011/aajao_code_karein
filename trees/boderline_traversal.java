import java.util.ArrayList;



public class boderline_traversal {

    static boolean isLeaf(Node root)
    {
        return (root.left == null ) && (root.right == null);
    }
    static void addLeftBoundary(Node root, ArrayList<Integer> res) 
    {
        Node curr = root.left;

        while(curr != null)
        {
            if(isLeaf(curr) == false)
            {
                res.add(curr.data);
            }
            if(curr.left != null)
            {
                curr = curr.left;
            }
            else
            {
                curr = curr.right;
            }
        }
        
    }


     static ArrayList<Integer> printBoundary(Node root) 
     {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(isLeaf(root) == false)
        {
            res.add(root.data);
        }
        addLeftBoundary(root, res);
        addLeafNodes(root,res);
        addRightBounday(root,res);
     

        return res;
    }

     static void addLeafNodes(Node root, ArrayList<Integer> res) 
    {
        if(isLeaf(root))
        {
            res.add(root.data);
            return;
        }
        if(root.left!=null)
        {
            addLeafNodes(root.left, res);
        }
        if(root.right!=null)
        {
            addLeafNodes(root.right, res);
        }
    }
    private static void addRightBounday(Node root, ArrayList<Integer> res) 
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Node curr = root.right;

        while(curr!=null)
        {
            if(isLeaf(curr) == false)
            {
                temp.add(curr.data);
            }   
            if(curr.right != null)
            {
                curr = curr.right;
            }
            else
            {
                curr = curr.left;
                    
            }

        }

        for(int i = temp.size()-1;i>=0;i--)
        {
            res.add(temp.get(i));
        }
      
    }

    public static void main(String[] args) 
    {
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

        ArrayList<Integer> res = printBoundary(root);

        for (int i = 0; i < res.size(); i++) 
        {
            System.out.println(res.get(i)+ " ");
            
        }
        


        
    }

}
