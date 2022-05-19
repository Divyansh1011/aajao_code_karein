import java.util.ArrayList;
import java.util.Stack;

public class topological_Sort 
{
    static void findTopoSort(int node, int vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) 
    {
        vis[node] = 1;
        for(Integer i: adj.get(node))
        {
            if(vis[i] == 0)
            {
                findTopoSort(i, vis, adj, st);
            }

        }
        st.push(node);


    }
    static int [] topoSort(int v, ArrayList<ArrayList<Integer>> adj) 
    {
        Stack<Integer> s = new Stack<Integer>();
        int vis[] = new int[v];

        for (int i = 0; i<v;i++) 
        {
            if (vis[i] == 0) 
            {
                findTopoSort(i, vis,adj,s);
            }
            
        }

        int topo[] = new int[v];
        int ind = 0;

        while (!s.isEmpty()) 
        {
            topo[ind++] = s.pop();
            
        }

        return topo;


    }
    
    public static void main(String[] args) 
    {
        int v =6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);

        for (int i = 0;i<v;i++)
        {
         adj.add(new ArrayList<Integer>());
        }

        adj.get(5).add(2);
      //  adj.get(2).add(5);
        adj.get(5).add(0);
       // adj.get(0).add(5);
        adj.get(4).add(0);
      //  adj.get(0).add(4);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);
        /*adj.get(5).add(4);
        adj.get(4).add(6);
        adj.get(6).add(4);
        adj.get(1).add(6);
        adj.get(6).add(1);*/


    int arr[] =     topological_Sort.topoSort(v, adj);

    for(int i =0;i<v;i++)
    {
        System.out.println(arr[i]);
    }
    
    }
   
    
}
