import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node
{
    int data;
    int hd;
    Node left;
    Node right;
    Node(int key)
    {
        this.data = key;
        right = null;
        left = null;
        hd = Integer.MAX_VALUE;

    }
}


public class bottom_view {
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

        ArrayList<Integer> res = bottomview(root);
        for(int i = 0;i<res.size();i++)
        {
            System.out.println(res.get(i));
        }

        
    }

    private static ArrayList<Integer> bottomview(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)
        {
            return ans;
        }
        Map<Integer,Integer> mp = new TreeMap<>();
        Queue<Node> q = new LinkedList<Node>();
        root.hd = 0;
        q.add(root);

        while(!q.isEmpty())
        {Node temp = q.remove();
            int hd = temp.hd;
            mp.put(hd, temp.data);
            if(temp.left != null)
            {
                temp.left.hd = hd-1;
                q.offer(temp.left);
            }
            if(temp.right !=null)
            {
                temp.right.hd = hd+1;
                q.offer(temp.right);
            }
        }
        for(Map.Entry<Integer,Integer> map : mp.entrySet())
        {
            ans.add(map.getValue());
        }
        return ans;
    }
}
