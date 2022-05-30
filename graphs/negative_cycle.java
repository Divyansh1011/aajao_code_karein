import java.util.ArrayList;

class Node
{
    private int  u;
    private int v;
    private int w;

    Node(int _u,int _v,int _weight)
    {
        u = _u;
        v = _v;
        w = _weight;
    }
    Node()
    {

    }

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
        return w;
    }
}

public class negative_cycle 
{
    void bellmanford(ArrayList<Node> adj, int N,int src)
    {
        int dist[] = new int[N];
        for (int i = 0; i < N; i++)
        {
            dist[i] = Integer.MAX_VALUE;            
        }
        dist[src] = 0;

        for (int i = 0; i < N-1; i++) 
        {
            for(Node node : adj)
            {
                if(dist[node.getU()] + node.getWeight() < dist[node.getV()])
                {
                    dist[node.getV()] = dist[node.getU()] + node.getWeight();
                }
            }
        }

        int fl = 0;
        for(Node node :adj )
        {
            if(dist[node.getU()] + node.getWeight() < dist[node.getV()])
            {
                fl =1;
                System.out.println("Negative Cycle");
                break;
            }
            
        }

        
        if(fl==0)
        {
            for (int i = 0; i < N ; i++) 
            {
                System.out.println(i + "" + dist[i]);
            }
        }




    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Node> adj = new ArrayList<Node>();

        adj.add(new Node(3,2,6));
        adj.add(new Node(5,3,1));
        adj.add(new Node(0,1,5));
        adj.add(new Node(1,5,-3));
        adj.add(new Node(1,2,-2));
        adj.add(new Node(3,2,-2));
        adj.add(new Node(3,2,3));
        
        negative_cycle obj = new negative_cycle();
        obj.bellmanford(adj, v, 0);





    }
}
