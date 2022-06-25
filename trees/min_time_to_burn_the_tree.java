import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class min_time_to_burn_the_tree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int target = 4;
        int res = distancek(root ,target);
        System.out.println(res);

        
    }

    private static int distancek(Node root, int t) {
        HashMap<Node,Node> mp = new HashMap<Node,Node>();
        Node target =  bfstomapparent(root, mp,t);
        int max1 = findmaxdistance(mp,target);
        return max1;
    }

    private static int findmaxdistance(HashMap<Node, Node> mp, Node target) 
    {
        Queue<Node> q = new LinkedList<>();
        q.offer(target);
        int time = 0;
        HashMap<Node,Boolean> m = new HashMap<Node,Boolean>();

        m.put(target, true);


        while(!q.isEmpty())
        {
            int size = q.size();
            int fl = 0;

            for(int i = 0;i<size;i++)
            {
                Node node = q.poll();
                if(node.left!=null && m.get(node.left) == null)
                {
                    fl=1;
                    m.put(node.left, true);
                    q.offer(node.left);
                }
                if(node.right!=null && m.get(node.right) == null)
                {
                    fl=1;
                    m.put(node.right, true);
                    q.offer(node.right);
                }
                if(mp.get(node)!=null && m.get(mp.get(node)) !=null)
                {
                    fl = 1;
                    m.put(mp.get(node), true);
                    q.offer(mp.get(node));

                }
            }

            if(fl==1)
            {
                time++;
            }

        }
        return time;
    }

    private static Node bfstomapparent(Node root, HashMap<Node,Node> mp,int start) 
    {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        Node t =   new Node(-1);
        while(!q.isEmpty())
        {
            Node temp = q.peek();
            q.poll();
            if(temp.data ==start)
            {
                t = temp;
            }
            if(temp.left!=null)
            {
                q.offer(temp.left);
                mp.put(temp.left,temp);

            }

            if(temp.right !=null)
            {
                q.offer(temp.right);
                mp.put(temp.right, temp);
            }
        }
        return t;
    }
}
