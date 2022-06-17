import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class iterative_inorder {

    static List<Integer>  in_order_iterative(Node root) 
    {
        List<Integer> inorder = new ArrayList<Integer>();
        Stack<Node> s = new Stack<Node>();

        Node node = root;

        while(true)
        {
            if(node!= null)
            {
                s.push(node);
                node = node.left;
            }
            else
            {
                if(s.isEmpty())
                {
                    break;
                }

                node = s.pop();
                inorder.add(node.data);
                node = node.right;  
            }
        }
        return inorder;
    }
    public static void main(String[] args) 
    {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

      List<Integer> res =   in_order_iterative(root);

      for (int i = 0; i < res.size(); i++) 
      { 
        System.out.println(res.get(i));

        
      }

        
    }

    
}
