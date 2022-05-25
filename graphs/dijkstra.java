import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;



class Node1 implements Comparator<Node1>
{
    private int v;
    private int weight;
    Node1(int _v, int _w) { v = _v; weight = _w; }
    Node1()
    {   
    }
    int getV() { return v; }
    int getWeight() { return weight; }

    @Override
    public int compare(Node1 node, Node1 node1) {
        if(node.weight < node1.weight)
        {
            return -1;
        }
        if(node.weight> node1.weight)
        {
            return 1;
        }
        return 0;
    }

}

public class dijkstra {

    void shortestPath(int s, ArrayList<ArrayList<Node1>> adj, int n)
    {
        int dist[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;

        PriorityQueue<Node1> pq = new PriorityQueue<Node1>(n,new Node1());

        pq.add(new Node1(s,0));

        while(pq.size() > 0)
        {
            Node1 node = pq.poll();

            for(Node1 it: adj.get(node.getV()))
            {
                if(dist[node.getV()] + it.getWeight() < dist[it.getV()])
                {
                    dist[it.getV()] = dist[node.getV()] + it.getWeight();
                    pq.add(new Node1(it.getV(), dist[it.getV()]));
                }
            }
        }

        for (int i = 0; i < n; i++) 
        {
            System.out.println(dist[i] + " ");
            
        }
    }
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Node1> > adj = new ArrayList<ArrayList<Node1> >();
		
		for (int i = 0; i < n; i++) 
			adj.add(new ArrayList<Node1>());
			
		adj.get(0).add(new Node1(1, 2));
		adj.get(0).add(new Node1(4, 1));
		adj.get(1).add(new Node1(2, 3));
		adj.get(2).add(new Node1(3, 6));
		adj.get(4).add(new Node1(2, 2));
		adj.get(4).add(new Node1(5, 4));
		adj.get(5).add(new Node1(3, 1));
        dijkstra obj = new dijkstra();
        obj.shortestPath(0, adj, n);
    }
}
