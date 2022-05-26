import java.util.ArrayList;

class Node
{
    private int v;
    private int weight;
    Node(int _v, int _w) { v = _v; weight = _w; }
    Node()
    {   
    }
    int getV() { return v; }
    int getWeight() { return weight; }



}

public class prims_algo_mst {

    void prims(ArrayList<ArrayList<Node>> adj, int n)
    {
        int key [ ] = new int[n];
        int parent [] = new int[n];
        boolean mstset[] = new boolean[n];

        for(int i = 0;i<n;i++)
        {
            key[i] = Integer.MAX_VALUE;
            mstset[i] = false;
            parent[i] = -1;
        }

        //Setting the first key as 0 

        key[0] = 0;

        //first step select the min key value and its not there in the mst array too at the same tiem e

        for (int i = 0; i < n-1; i++) 
        {
            int min1 = Integer.MAX_VALUE;
            int u = 0;
            for(int v = 0;v<n;v++)
            {
                if(mstset[v] == false && key[v] < min1)
                {
                    min1 = key[v];
                    u =v;
                }
            }

            //mark it as true in mst for the correponding u
            mstset[u] = true;

            //iterate for the adjactne nodes 

            for (Node it : adj.get(u)) {

                if(mstset[it.getV()] == false && it.getWeight() < key[it.getV()])
                {
                    //checking if the adjacent nodes are included in the mst or not and also min then the key 
                    //update the parent array 
                    parent[it.getV()] = u;
                    key[it.getV()] = it.getWeight();
                }
            }

            //for the n-1 edges 
        }

        for(int i = 1; i<n;i++)
        {
            System.out.println(parent[i]+ "-" + i);
        }



    }
    public static void main(String[] args) 
    {
        int n =5 ;
        ArrayList<ArrayList<Node>> adj = new ArrayList<ArrayList<Node>>();

        for (int i = 0; i < n; i++) 
        {
            adj.add(new ArrayList<Node>());
            
        }

        adj.get(0).add(new Node(1, 2));
        adj.get(0).add(new Node(0, 2));

        adj.get(0).add(new Node(2, 3));

        adj.get(0).add(new Node(1, 3));

        adj.get(0).add(new Node(3, 6));

        adj.get(0).add(new Node(0, 6));

        adj.get(0).add(new Node(3, 8));
        adj.get(0).add(new Node(1, 8));

        adj.get(0).add(new Node(4,5 ));

        adj.get(0).add(new Node(1, 5));
        adj.get(0).add(new Node(4, 7));

        adj.get(0).add(new Node(2, 7));


            prims_algo_mst obj = new prims_algo_mst();
            obj.prims(adj, n);




            
    }
}


/* Time complexity for this brute force approach is O(N^2)
    which is bad as there is multiple use of the for loops 
    + Traversal of the nodes also gives O(E)

    O(n^2 + n + e) 
*/