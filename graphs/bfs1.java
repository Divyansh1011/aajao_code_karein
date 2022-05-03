import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

/**
 * bfs1
 */
public class bfs1 {

    public static ArrayList<Integer> bsf(int v, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[v+1];

        for (int i = 0; i <= v; i++) 
        {
            if(vis[i] == false)
            {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while (q.isEmpty()) 
                {
                    Integer node =  q.poll();
                    bfs.add(node);

                    for (Integer it: adj.get(node)) 
                    {
                        if(vis[it] == false)
                        {
                            vis[it] = true;
                            q.add(it);
                        }
                        
                    }
                    
                }
            }
            
        }

        return bfs;
    }

    public static void main(String[] args) 
    {

        int V = 5; // number of the vertices required for making the ArrayList

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i = 0; i < V; i++) 
        {
            adj.add(new ArrayList<Integer>());            
        }



        
    }
}
