import java.util.LinkedList;
import java.util.Queue;

class Pair
{
    int index;
    Node node;
    Pair(int index,Node node)
    {
        this.index = index;
        this.node = node;
    }
}

public class max_width {
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

        int res = maxWidth(root);

        System.out.println(res);

        
    }

    private static int maxWidth(Node root) 
    {
        if(root == null)
        {
            return 0;
        }
        Queue<Pair> p = new LinkedList<Pair>();
   
    int ans = 0;
    p.offer(new Pair(0, root));

    while(!p.isEmpty())
    {
        int mnim = p.peek().index;
        int size = p.size();
        int first = 0;
        int second = 0;
        for(int i =0 ;i<size;i++)
        {
            int cur_id = p.peek().index - mnim;
            Node node = p.peek().node;
            p.poll();
            if(i ==0 )
            {
                first = cur_id;
            }
            if(i == size - 1)
            {
                second = cur_id;
            }
            if(node.left!= null)
            {
                p.offer(new Pair(cur_id * 2 + 1, node.left));
            }
            if(node.right!=null)
            {
                p.offer(new Pair(cur_id*2 +2, node.right));
            }
        }

        ans = Math.max(ans, second - first + 1);




    }
        return ans;
    }
}
