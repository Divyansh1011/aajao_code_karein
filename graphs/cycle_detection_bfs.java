import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * cycle_detection_bfs
 */

class Node
{
    int first;
    int second;

    public Node(int first, int second)
    {
        this.first = first;
        this.second = second;

    }
}
public class cycle_detection_bfs {


    public static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean vis[])
    {

        Queue<Node> q = new LinkedList<>();

        q.add(new Node(s, -1));

        vis[s] = true;

        while (!q.isEmpty()) {
            int node  = q.peek().first;
            int parent = q.peek().second;

            q.remove();

            for(Integer it : adj.get(node))
            {
                if(vis[it]== false)
                {
                    q.add(new Node(it,node));
                    vis[it] = true;
                }

                else if(parent != it)
                {
                    return true;
                }
        }
        }
        return false;


    }
    public static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis [] = new boolean[v+1];
        Arrays.fill(vis, false);

        for(int i = 0; i<v;i++)
        {
            if(vis[i] == false)
            {
                if(checkForCycle(adj, i , vis))
                {
                    return true;

                }
            }
        } 

        return false;
    }
 public static void addEdge(ArrayList<ArrayList<Integer>> adj, int v, int u)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    public static void main(String[] args) 
    {
        int v = 4;
         ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);


        for(int i = 0; i < v; i++) 
        {
            adj.add(new ArrayList<Integer>());            
        }

     
    addEdge(adj, 0, 1);
    addEdge(adj, 1, 2);
    addEdge(adj, 2, 0);
    addEdge(adj, 2, 3);


    System.out.println(isCycle(v,adj));
  



        
    }
}
