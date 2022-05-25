import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class shortest_distance {
    public static void printShortestDistance(ArrayList<ArrayList<Integer>> adj, int source, int n) 
    {
        int dist[] = new int[n];

        for (int i = 0; i < n; i++) 
        {
            dist[i] = 100000000;
        }

        Queue<Integer> q = new LinkedList<>();

        dist[source] = 0;
        q.add(source);

        while(q.isEmpty() == false)
        {
            int node = q.poll();

            for(int i:adj.get(node))
            {
                if(dist[node] + 1 < dist[i])
                {
                    dist[i] = dist[node] + 1;
                    q.add(i);
                }
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.println(dist[i]);
            
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int i,int j)
    {
        adj.get(i).add(j);
        adj.get(j).add(i);

    }
    public static void main(String[] args) 
    {
        int V = 8;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < V; i++) 
        {
            adj.add(new ArrayList<Integer>());            
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 3, 7);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 4, 7);
        addEdge(adj, 5, 6);
        addEdge(adj, 6, 7);

        int source = 0;
        //int dest = 7;
        printShortestDistance(adj,source,V);
        




        
    }
   
}
