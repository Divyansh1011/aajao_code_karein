import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

import javafx.util.Pair;

public class max_train_stops {

    static void maxstop(int n,int m,int arr[][])
    {
        ArrayList<Pair<Integer, Integer>> adj = new ArrayList<Pair<Integer,Integer>>(n+1);

        for (int i = 0; i < m; i++) 
        {
            adj.add(arr[i][2], new Pair<Integer,Integer>(arr[i][1], arr[i][0]));
        }

    Collections.sort(adj, new Comparator<Pair<Integer, Integer>>() {

        @Override
        public int compare(Pair<Integer, Integer> arg0, Pair<Integer, Integer> arg1) 
        {
            if(arg0.getValue() > arg1.getValue() )
            {
                return -1;
            }
            else if(arg0.getValue().equals(arg1.getValue()))
            {
                return 0;
            }
            else
            {
                return 1;
            }

        }        
    });

    for (Pair<Integer, Integer> it : adj) 
    {
        System.out.println(it.getValue());
        
    }

    

    }
    public static void main(String[] args) 
    {
        int n = 2;
        int m = 5;



        int [][] arr = {{ 1000, 1030, 1},
            {1010, 1020, 1},
            {1025, 1040, 1},
            {1130, 1145, 2},
            {1130, 1140, 2 }}   ;


            maxstop(2,5,arr);


            


       
        
    }
}
