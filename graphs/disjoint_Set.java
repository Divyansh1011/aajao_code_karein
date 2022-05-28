import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Node
{
    private int u;
    private int v;
    private int weight;

    Node(int _u, int _v,int _w)
    {
        u = _u;
        v= _v;
        weight = _w;
    }

    Node() {}

    int getV()
    {
        return v;
    }
    int getU()
    {
        return u;
    }

    int getWeight()
    {
        return weight;
    }
}

class SortComparator implements Comparator<Node>
{

    @Override
    public int compare(Node arg0, Node arg1) 
    {
        if(arg0.getWeight() < arg1.getWeight())
        {
            return -1;
        }

        if(arg0.getWeight()> arg1.getWeight())
        {
            return 1;
        }

        return 0;
    }
    
}

public class disjoint_Set {

    int findPar(int node, int[] parent)
    {

        if(node == parent[node])
        {
            return node;
        }

        return parent[node] = findPar(parent[node], parent);
    }

      

     void union(int u, int v, int[] parent, int[] rank) 
     {
         u = findPar(u, parent);
         v = findPar(v, parent);

         if(rank[u] < rank[v])
         {
             parent[u] = v;
         }
         else if(rank[v] < rank[u])
         {
             parent[v] = u;
         }
         else
         {
             parent[v] = u;
             rank[u]++;
         }
     }


    void kruskal(ArrayList<Node> adj, int n)
    {
        Collections.sort(adj, new SortComparator());
        int parent[] = new int[n];
        int rank [] = new int[n];

        for(int i = 0; i< n ;i ++)
        {
            parent[i] = i;
            rank[i] = 0;
        }
        int costMst = 0;
        ArrayList<Node> mst = new ArrayList<Node>();

        for (Node it : adj) 
        {
            if(findPar(it.getU(),parent) != findPar(it.getV(), parent)) //checking if the components are simillar 
            {
                costMst += it.getWeight();//if yes the node can be inserted into the array 
                mst.add(it);
                union(it.getU(), it.getV(), parent, rank);
            }
        }

        System.out.println(costMst);
        for(Node it: mst)
        {
            System.out.println(it.getU() + " - " + it.getV());
        }
    }








    public static void main(String[] args) 
    {
        int n = 5;
        ArrayList<Node> adj = new ArrayList<Node>();

        adj.add(new Node(0,1,2));
        adj.add(new Node(0,3,6));
        adj.add(new Node(1,3,8));
        adj.add(new Node(1,2,3));
        adj.add(new Node(1,4,5));
        adj.add(new Node(2,4,7));

        disjoint_Set obj = new disjoint_Set();
        obj.kruskal(adj, n);
        
        
        
    }
}
