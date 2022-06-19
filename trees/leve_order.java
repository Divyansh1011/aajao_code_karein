
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;


class tuple
{
    Node node;
    int row;
    int col;
    public tuple(Node node, int row,int col)
    {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
public class leve_order {


    public static void main(String[] args) 
    {
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

       List<List<Integer>> res = traverse(root);

       for(List<Integer> it : res)
       {
        for(int i: it)
        System.out.println(i);
        
       }



        
    }

    private static List<List<Integer>> traverse(Node root) 
    {
        Queue<tuple> q= new LinkedList<tuple>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();

        q.offer(new tuple(root,0,0));
        while(!q.isEmpty())
        {
            tuple t = q.poll();
            Node node = t.node;
            int x = t.row;
            int y = t.col;

            if(!map.containsKey(x))
            {
                map.put(x, new TreeMap<>() );
            }
            if(!map.get(x).containsKey(y))
            {
                map.get(x).put(y, new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.data);
            if(node.left !=null)
            {
                q.offer(new tuple(node.left, x-1, y+1));
            }
            if(node.right!=null)
            {
                q.offer(new tuple(node.right, x+1, y+1));
            }

        }
        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer,PriorityQueue<Integer>> ys : map.values()) 
        {
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes: ys.values())
            {
                while (!nodes.isEmpty()) 
                {
                    list.get(list.size()-1).add(nodes.poll());
                    
                }
            }
        }
        return list;
    }
}
