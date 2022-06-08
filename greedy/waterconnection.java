import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



/**
 * waterconnection
 */
public class waterconnection {

     static ArrayList<Integer> dfs(int start, ArrayList<Integer> tmp,
            HashMap<Integer, ArrayList<Integer>> mp, ArrayList<Integer> a, ArrayList<Integer> b)
    {
        if(!a.contains(start)) return tmp;
        int diameter = Math.min(tmp.get(2),mp.get(start).get(1));
        int i = tmp.set(2,diameter);
        int end = mp.get(start).get(0);
        i = tmp.set(1,end);
        return dfs(mp.get(start).get(0),tmp,mp,a,b);
        
    }


    static ArrayList<ArrayList<Integer>> solve(int n, int p, ArrayList<Integer> a ,ArrayList<Integer> b ,ArrayList<Integer> d) 
    { 
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> mp = new HashMap<>();
        for(int i = 0;i<a.size();i++){
            ArrayList<Integer> mplist = new ArrayList<>();
            mplist.add(b.get(i));
            mplist.add(d.get(i));
            mp.put(a.get(i),mplist);
        }
        List<Integer> ls = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!b.contains(i) && a.contains(i)){
                ls.add(i);
            }
        }
        for(int i = 0;i<ls.size();i++){
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(ls.get(i));
            int end = mp.get(ls.get(i)).get(0) ,diameter = mp.get(ls.get(i)).get(1);
            tmp.add(end);
            tmp.add(diameter);
            tmp = dfs(mp.get(ls.get(i)).get(0),tmp,mp,a,b);
            res.add(tmp);
        }
        
        return res;
    }





    public static void main(String[] args) {
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
