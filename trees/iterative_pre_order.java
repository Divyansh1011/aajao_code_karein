import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterative_pre_order 
{

     static List<Integer> iterative_pre_order_traversal(Node root) 
    {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null)
        {
            return list;
        }
        Stack<Node> s = new Stack<Node>();
        s.push(root);
        while(!s.isEmpty())
        {
            root = s.pop();
            list.add(root.data);

            if(root.right != null)
            {
                s.push(root.right);
            }

            if(root.left != null)
            {
                s.push(root.left);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> res = iterative_pre_order_traversal(root);

        for (int i = 0; i < res.size(); i++) 
        {
            System.out.println(res.get(i));
            
        }   
    }

  
    
}
