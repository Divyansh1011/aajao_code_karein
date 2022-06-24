import java.util.ArrayList;

public class path_root_to_node {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> arr = path(root,7);

        for (int i = 0; i < arr.size(); i++) 
        {System.out.println(arr.get(i));
            
            
        }
        
        
    }

    private static ArrayList<Integer> path(Node root, int i) 
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null)
        {
            return res;
        }

        getPath(root,res,i);
        return res;
        
    }

    private static boolean getPath(Node root,ArrayList<Integer> res, int i) 
    {
        if(root == null)
        {
            return false;
        }
        res.add(root.data);
        if(root.data == i)
        {
            return true;
        }
        if(getPath(root.left, res, i) || getPath(root.right, res, i))
        {
            return true;
        }

        res.remove(res.size() - 1);
        return false;
    }
}
