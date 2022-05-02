import java.util.ArrayList;
import java.util.LinkedList;



/**
 * bfs
 */
public class bfs 
{

    private ArrayList<ArrayList<Integer>> adj;
    private int V;

    bfs(int v)
    {
        V = v;
        adj =   new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) 
        {
            adj.add(new ArrayList<Integer>());
            
        }
    }

    void addEdge(int v,int w)
    {
        adj.get(w).add(v);
        adj.get(v).add(w);
    }

    void BFS(int a)
    {
        boolean visited[] = new boolean[V];


        //creating a queue

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[a] = true;
        queue.add(a);

        while(queue.size() != 0)
        {
             a= queue.poll();
             System.out.println(a+" ");

             for(int i = 0; i< adj.size();i++)
             {
                 for(int j = 0; j< adj.get(i).size(); j++)
                 {
                     int n = adj.get(i).get(j);
                 if(!visited[n])
                 {
                     visited[n] = true;
                     queue.add(n);
                 }

                 }
             }

    }
}

 public static void main(String[] args) {
     bfs g = new bfs(4);

     g.addEdge(0, 1);
     g.addEdge(0, 2);
     g.addEdge(1, 2);
     g.addEdge(2, 0);
     g.addEdge(2, 3);
     g.addEdge(3, 3);

     g.BFS(2);
     

     

 }


    
}
