import java.util.ArrayList;

public class cut_edge {
     void dfs(int node, int parent, int[] vis, int[] tin, int[] low, ArrayList<ArrayList<Integer>> adj, int timer) 
    {
        vis[node] = 1;
        tin[node] = low[node] = timer ++;

        for(Integer it: adj.get(node))
        {
            if(it== parent)
            {
                continue;
            }

            if(vis[it] == 0 )
            {
                dfs(it, node, vis, tin, low, adj, timer);
                low[node] = Math.min(low[node],low[it] );
                //checking for the bridge condition by checking the lower time of the current node and the next node
                if(low[it] > tin[node])
                {
                    System.out.println(it + " " + node);
                }
            }
            else
            {
                low[node] = Math.min(low[node], tin[node]);
            }
        }
        
        
    }

    void printbridges(ArrayList<ArrayList<Integer>> adj, int n) 
    {
        int vis[] = new int[n];
        int tin[] = new int[n];
        int low[] = new int[n];

        int timer = 0;    
        for(int i = 0; i< n ;i++)
        {
            if(vis[i] == 0)
            {
                dfs(i,-1,vis,tin, low, adj, timer);
            }
        }


    }
  
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>();

        for(int i = 0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);
        
        adj.get(1).add(2);
        adj.get(2).add(1);
        
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        adj.get(3).add(4);
        adj.get(4).add(3);

        cut_edge obj = new cut_edge();
        obj.printbridges( adj,n);
               

    }

 



}
