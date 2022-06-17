import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterative_postorder_traversal {
    static List<Integer> iterative_postorder(Node root)
    {
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        List<Integer> postorder = new ArrayList<Integer>();

        if(root == null)
        {
            return postorder;
        }

        s1.push(root);

        while(!s1.isEmpty())
        {
            root = s1.pop();
            s2.add(root);
            if(root.left!= null)
            {
                s1.push(root.left);
            }
            if(root.right!= null)
            {
                s2.push(root.right);
            }
        }

        while(!s2.isEmpty())
        {
            postorder.add(s2.pop().data);
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

        List<Integer> res = iterative_postorder(root);

        for(int i = 0;i<res.size();i++)
        {
            System.out.println(res.get(i));
        }
    }
}


//time complexity = T(N)
//Space Compleity = T(2N)