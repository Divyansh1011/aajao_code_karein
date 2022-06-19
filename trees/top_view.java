import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;




class Pair
{
    Node root;
    int level;
    Pair(Node root, int level)
    {
        this.root = root;
        this.level = level;
    }
}

public class top_view {
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

        ArrayList<Integer> res = topview(root);

        for (int i = 0; i < res.size(); i++) 
        {
            System.out.println(  res.get(i));
          
            
        }

    }

    private static ArrayList<Integer> topview(Node root) 
    {
        Queue<Pair> q = new LinkedList<Pair>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        Map<Integer,Integer> mp = new TreeMap<>();

        if(root == null)
        {
            return ans;
        }

        q.offer(new Pair(root, 0));

        while(!q.isEmpty())
        {
            Pair it = q.poll();
            Node n = it.root;
            int hd = it.level;
            if(mp.get(hd) == null)
            {
                mp.put(hd, n.data);
            }
            if(n.left!= null)
            {
                q.offer(new Pair(n.left, hd-1));
            }

            if(n.right!= null)
            {
                q.offer(new Pair(n.right, hd+1));
            }

        }

        for (Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            ans.add(entry.getValue()); 
        }


        return null;
    }
}
