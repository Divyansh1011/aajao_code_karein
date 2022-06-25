import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class print_all_nodes_k {

    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

       Node target = new Node(5);
        int k = 2;


            List<Integer> list = distancek(root,target,k );
            for(int i = 0;i<list.size();i++)
            {
                System.out.println(list.get(i));
            }



    }

    private static List<Integer> distancek(Node root, Node target, int k) {
        Map<Node,Node> map = new HashMap<>();
        markparents(root,map,target);
        Map<Node,Boolean> visited = new HashMap<Node,Boolean>();
        Queue<Node> q = new LinkedList<Node>();

        int distance = 0;
        q.offer(target);
        visited.put(target, true);

        while(!q.isEmpty())
        {
            int size = q.size();
            if(distance == k)
            {
                break;
            }
            distance++;
            for(int i = 0 ; i<size;i++)
            {
                Node current = q.peek();
                q.poll();
                if(current.left!=null && visited.get(current.left)==null)
                {
                    q.offer(current.left);
                    visited.put(current.left, true);
                }
                if(current.right!=null && visited.get(current.right)==null)
                {
                    q.offer(current.right);
                    visited.put(current.right, true);
                }

                if(map.get(current) !=null && visited.get(current)==null) 
                //checking the parent of the node if it exist and is not visited we push it to the queue and mark it visited in the visited map 
                {
                    q.offer(map.get(current));
                    visited.put(map.get(current), true);
                }

            }
        }

        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty())
        {
            Node curr = q.poll();
            result.add(curr.data);
        }
        return result;

    }

    private static void markparents(Node root, Map<Node, Node> map, Node target) 
    {
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        while(!q.isEmpty())
        {
            Node currnt = q.poll();
            if(currnt.left!=null)
            {
                map.put(currnt.left, currnt);
                q.offer(currnt.left);
            }
            if(currnt.right!=null)
            {
                map.put(currnt.right, currnt);
                q.offer(currnt.right);
            }
            

        }
    }
}
