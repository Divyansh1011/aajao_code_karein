
import java.util.*;
import java.util.LinkedList;

public class graphs_1 
{
    private int v;
    private LinkedList<Integer> adj[];

    graphs_1(int V)
    {
        v = V;
        adj = new LinkedList[V];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();

    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    Boolean isReachable(int s , int d)
    {   
        boolean visited[] = new boolean[v];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        Iterator<Integer> i;
        while (queue.size()!=0) 
        {
            int n;

            i = adj[s].listIterator();

            while (i.hasNext()) 
            {
                n = i.next();

                if (n==d) 
                {
                    return true;
                }

                if (!visited[n]) 
                {
                    visited[n] = true;
                    queue.add(n);
                }
                
            }

        }

        return false;

    }


public static void main(String[] args) 
{

    graphs_1 g = new graphs_1(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    int u = 1;
    int v = 3;

    if(g.isReachable(u, v))
    {
        System.out.println("There is a path from" + u + "to" + v);   
    }
    else
    {
        System.out.println("There is not a path from" + u + "to" + v);
    }
}
}


