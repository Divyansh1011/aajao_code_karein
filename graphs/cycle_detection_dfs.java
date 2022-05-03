import java.util.ArrayList;
import java.util.Arrays;

/**
 * cycle_detection_dfs
 */
public class cycle_detection_dfs {
    public static boolean  Cycle(int node, int parent, boolean vis[], ArrayList<ArrayList<Integer>> adj)
    {
        vis[node] = true;
        for(Integer it : adj.get(node))
        { 
            if(vis[it] == false)
            {
               if(Cycle(it,node, vis,  adj) == true) return true;
            }
            
        }

        return false;
    }
    public static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis [] = new boolean[v+1];
        Arrays.fill(vis,false);

        for(int i = 1; i<v;i++)
        {
            if(vis[i] == false)
            {
                if(Cycle(i,-1,vis,adj))
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


        System.out.println(isCycle(v, adj));



        

    }
}
