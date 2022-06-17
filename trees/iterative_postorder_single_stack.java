import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterative_postorder_single_stack
{

    static List<Integer> iterative_postorder_single(Node root)
    {
        Stack<Node> s = new Stack<Node>();
        List<Integer> postorder = new ArrayList<Integer>();

        Node curr = root;

        while(curr!=null || !s.isEmpty())
        {
            if(curr!= null)
            {
                s.push(curr);
                curr = curr.left;
            }
            else
            {
                Node temp = s.peek().right;
                if(temp == null)
                {
                    temp = s.peek();
                    postorder.add(temp.data);
                    s.pop();
                    while(!s.isEmpty() && temp == s.peek().right)
                    {
                        temp = s.peek();
                        s.pop();
                        postorder.add(temp.data);

                    }
                }
                else
                {
                    curr = temp;
                }
            }
        }
        return postorder;

    }
  
    public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        List<Integer> res = iterative_postorder_single(root);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
            
        }
        
    }
    
}
