import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        this.data = key;
    }

    Node(int key, Node left, Node right)
    {
        this.data = key;
        this.left = left;
        this.right = right;
    }
}

public class level_order_traversal 
{

    static List<List<Integer>> level_order(Node root) 
    {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Queue<Node> q = new LinkedList<Node>();

        if(root == null)
        {
            return res;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size(); 
            List<Integer> sub = new LinkedList<Integer>();
            for(int i = 0;i<size;i++)
            {
                if(q.peek().left != null)
                {
                    q.offer(q.peek().left);
                }

                if(q.peek().right != null)
                {
                    q.offer(q.peek().right);
                }
                sub.add(q.poll().data);
            } 
            res.add(sub);
        }

        return res;
    }
    public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> result = level_order(root);

        for (int i = 0; i < result.size(); i++) 
        {
            System.out.println(result.get(i));
            
        }





    }

   
}
