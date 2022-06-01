import java.util.ArrayList;
import java.util.Scanner;

public class transpose_graph {

  
    static Scanner sc = new Scanner(System.in);
    static int ve = sc.nextInt();

   private static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(ve);
   private static ArrayList<ArrayList<Integer>> transpose = new ArrayList<ArrayList<Integer>>(ve);

   static void addEdge(int u, int v, boolean b) 
    {
        if(!b)
        {
            adj.get(u).add(v);
        }
        else
        {
                transpose.get(u).add(v);
        }


    }


    static void getTranspose() 
    {
        for (int i = 0; i < ve; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) 
            {
                addEdge(adj.get(i).get(j), i, true);
                
            }
            
        }

    }

    static void printgraph()
    {
        for(int i = 0 ; i<ve; i++)
        {
            System.out.print(i + "--> ");
            for(int j = 0; j < transpose.get(i).size(); j++)
                System.out.print(transpose.get(i).get(j) + " ");
            System.out.println();

        }
    }

    public static void main(String[] args) 
    {
       
        for (int i = 0; i < ve; i++) 
        {
            adj.add(new ArrayList<>());
            transpose.add(new ArrayList<>());            
        }

        for (int i = 0; i < ve; i++) 
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(u,v,false);            
        }

        getTranspose();

        printgraph();
        



    }


    
}
