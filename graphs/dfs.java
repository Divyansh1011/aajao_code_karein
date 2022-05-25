import java.util.ArrayList;



/**
 * dfs
 */
public class dfs 
{

    public static void finalDfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDfs)
    {
        storeDfs.add(node);
        vis[node] = true;

        for(Integer it: adj.get(node))
        {
            if(vis[it] == false)
            {
                finalDfs(it,vis,adj,storeDfs);
            }
        }
    }



    public static void dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj)
    {

        ArrayList<Integer> storeDfs = new ArrayList<>();

        boolean vis[] = new boolean[v+1];

        for(int i = 0; i < vis.length; i++) {
            if(vis[i] == true)
            {
                finalDfs(i, vis,adj,storeDfs);
            }
        }

     for(int i = 0;i<storeDfs.size();i++)
     {
         System.out.println(storeDfs.get(i));
     }

    }


    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int v , int u)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) 
    {
        int v = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);

        for(int i= 0; i< v;i++)
        {

            adj.add(new ArrayList<Integer>());

        }

        
        addEdge(adj,0,1);
        addEdge(adj,0,4);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,3);
        addEdge(adj,3,4);

        dfsOfGraph(v,adj);

    }
}
