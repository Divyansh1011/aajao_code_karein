import java.util.ArrayList;

public class biparpite_graph_dfs {

    boolean dfscheck(ArrayList<ArrayList<Integer>> adj, int node, int color [])
    {
        if(color[node] == -1 )
        {
            color[node] = 1;
        }

        for (Integer it : adj.get(node)) 
        {
            if(color[it] == -1)
            {
                color[it] = 1- color[node];
                if(!dfscheck(adj, it, color))
                {
                    return false;
                }
            }

                else if(color[it] == color[node])
                {
                    return false;
                }
            }
            
            return true;
            
        }

    


    boolean checkBiparpite(ArrayList<ArrayList<Integer>> adj, int n)
    {
        int color [] = new int[n];
        for(int i = 0;i<n;i++)
        {
            color[i] = -1;

        }

        for(int i = 0;i<n;i++)
        {
            if(color[i] == -1)
            {
                if(!dfscheck(adj,i,color))
                {
                    return false;
                }
            }

        }

        return true;
    }
    public static void main(String[] args) 
    {

        int v =7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);

        for (int i = 0;i<v;i++)
        {
         adj.add(new ArrayList<Integer>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(4).add(3);
        adj.get(3).add(4);
        adj.get(4).add(5);
        adj.get(5).add(4);
        adj.get(4).add(6);
        adj.get(6).add(4);
        adj.get(1).add(6);
        adj.get(6).add(1);

       biparpite_graph obj = new biparpite_graph() ;

     if(obj.checkBiparpite(adj,v) == true)
     {
         System.out.println("Yes: its Biparpite");
     }

     else
     {
         System.out.println("Not Biparpite");
     }



        
    }
}
