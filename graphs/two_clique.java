import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class two_clique 
{
    static Scanner sc = new Scanner(System.in);
    static int ve = sc.nextInt();

   private static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(ve);
   private static ArrayList<ArrayList<Integer>> transpose = new ArrayList<ArrayList<Integer>>(ve);

    boolean bfscheck(ArrayList<ArrayList<Integer>> transpose, int parent, int colour[])
    {

        Queue<Integer> q = new LinkedList<>();

        q.add(parent);
        colour[parent] = 1;

      while(!q.isEmpty())
      {
          Integer poll = q.poll();

          for(Integer it : transpose.get(poll))
          {
              if(colour[it] == -1)
              {
                  colour[it] = 1 - colour[poll];
                  q.add(it);
              }
              else if(colour[it] == colour[poll])
              {
                  return false;
              }
          }

      }

      return true;

    }


    boolean checkBiparpite(ArrayList<ArrayList<Integer>> transpose, int v) 
    {
        int colour [] = new int[v];

        Arrays.fill(colour, -1);

        for (int i = 0; i < v; i++) 
        {
            if(colour[i] == -1)
            {
                if(bfscheck(transpose,i,colour))
                {
                    return false;
                }
            }
            
        }
        return true;
    }

    public void printgraph(ArrayList<ArrayList<Integer>> adj , int vertices)
    {
        for(int i = 0; i< adj.size(); i++) 
        {
            System.out.println("\nAdjacency list of vertext" + i);

            System.out.print("head");

            for(int j = 0; j < adj.get(i).size(); j++) 
            {
                System.out.print("->" + adj.get(i).get(j));
                
            }

            System.out.println();

            
        }
    }
    public static void addEdge(int u,int v, boolean choice)
    {
        if(!choice)
        {
            adj.get(u).add(v);  
        }
        else
        {
            transpose.get(u).add(v);

        }
    }

    public static void getTranspose()
    {
       for (int i = 0; i < ve; i++) 
       {
           for (int j = 0; j < adj.get(i).size(); j++) 
           {
               addEdge(adj.get(i).get(j), i, true);

           }
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

        two_clique obj = new two_clique();

        if(obj.checkBiparpite(transpose, ve) == true)
        {
            System.out.println("Two cilique ");
        }

        else
        {
            System.out.println("NO");
        }

        sc.close();
        
    }

}
