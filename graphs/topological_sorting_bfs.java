import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topological_sorting_bfs {
    static int[] topoSortbfs(ArrayList<ArrayList<Integer>> adj, int N)
    {
        int topo [] = new int[N];
        int indegree[] = new int[N];

        for(int i = 0;i<N;i++)
        {
            for (Integer it : adj.get(i)) 
            {
                indegree[it]++;
                
            }
        }

        Queue<Integer> q  = new LinkedList<Integer>();
        for(int i = 0;i<N;i++)
        {
            if(indegree[i] == 0)
            {
                q.add(i);
            }
        }

        int ind = 0;
        while(!q.isEmpty())
        {
            Integer node = q.poll();
            topo[ind++] = node;

            for(Integer it: adj.get(node))
            {
                indegree[it] --;
                if(indegree[it] ==0)
                {
                    q.add(it);
                }
            }

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


    int arr[] =     topological_sorting_bfs.topoSortbfs(adj, v);

    for(int i =0;i<v;i++)
    {
        System.out.println(arr[i]);
    }

        
    }
}
