import java.nio.file.Path;
import java.util.ArrayList;

import javafx.util.Pair;

/**
 * weighted_graph
 */
public class weighted_graph 
{
    public static void addEdge(ArrayList<ArrayList<Pair<Integer,Integer>>> adj, int v, int u,int w) 
    {

        adj.get(u).addAll(v,Pair<v,w>);


    }

    public static void main(String[] args) 
    {
        int V = 5; // number of the vertices required for making the ArrayList

        ArrayList<ArrayList<Pair<Integer,Integer>>> adj = new ArrayList<ArrayList<Pair<Integer,Integer>>>(V);

        for(int i = 0; i < V; i++) 
        {
            adj.add(new ArrayList<Pair<Integer,Integer>>());            
        }

        addEdge(adj,0,1,2);
        addEdge(adj,0,4,3);
        addEdge(adj,1,2,5);
        addEdge(adj,1,3,4);
        addEdge(adj,1,4,3);
        addEdge(adj,2,3,2);
        addEdge(adj,3,4,10);

        printGraph(adj);


        
    }

  

    
}