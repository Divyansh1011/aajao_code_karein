import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class waterconnection_1 
{
    static int[] dfs(int src, ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> d,
    HashMap<Integer, Integer> mp) 
    {
        int min = Integer.MAX_VALUE;


        while(mp.containsKey(src))
        {
            min = Math.min(min, d.get(mp.get(src)));
        }

    return new int[] {min,src};
    }

	static ArrayList<ArrayList<Integer>> solve(int n, int p, ArrayList<Integer> a, ArrayList<Integer> b,
    ArrayList<Integer> d) 
    {
        int in[] = new int[n+1];
        int out[] = new int[n+1];

        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        HashMap <Integer,Integer> mp = new HashMap<>();

        for(int i = 0;i<p;i++)
        {
            in[b.get(i)]++;
            out[a.get(i)]++;
            mp.put(a.get(i), i);
        }        

        for (int index = 0; index < n+1; index++) 
        {
            if(in[index] == 0 && out[index] == 1)
            {
                int src = index;
                int [] arr = dfs(src,a,b,d,mp);
                ArrayList<Integer> list1 = new ArrayList<>();
                list1.add(src);
                list1.add(arr[0]);
                list1.add(arr[1]);
                ans.add(new ArrayList<>(list1));    
            }
            
        }
        return ans;
    }
    
	public static void main(String[] args) 
    {
        int n;
        int p; 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> d = new ArrayList<Integer>();
        
        for (int i = 0; i < p; i++) 
        {
            a.add(sc.nextInt());
            b.add(sc.nextInt());
            d.add(sc.nextInt());
        }

        ArrayList<ArrayList<Integer>> res = solve(n,p,a,b,d);
        for (int i = 0; i < res.size(); i++) 
        {
            System.out.println(res.get(i).get(0) + " " + res.get(i).get(1) + " " + res.get(i).get(2));
            
        };
        sc.close();
        
    }

    
}
