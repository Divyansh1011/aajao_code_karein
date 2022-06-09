import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class candies_store {

    static ArrayList<Integer> solve(int[] candles, int n, int k) 
    {

        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(candles);
        int min_amount = 0;
        int max_amount = 0;
        int i = 0,end = n-1;
        while(i<=end){
            min_amount+=candles[i++];
            end-=k;
        }
        i = 0;
        end = n-1;
        while(i<=end){
            max_amount+=candles[end--];
            i+=k;
        }
        ans.add(min_amount);
        ans.add(max_amount);
        return ans;
	}
    public static void main(String[] args) 
    {
        int n;
        int k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int candles [] = new int[n];

        for (int index = 0; index < n; index++) 
        {


            candles[index] = sc.nextInt();
        }

        ArrayList<Integer> res = solve(candles, n,k);
        System.out.println(res.get(0) + " " + res.get(1));
        sc.close();


        
    }

	
}
