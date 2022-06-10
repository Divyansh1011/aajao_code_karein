import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class max_abs_difference {

    static int max_abs(int a[],int n)
    {

        List<Integer> ls = new ArrayList<Integer>();

        Arrays.sort(a);

        for (int i = 0; i < n/2; ++i) 
        {
            ls.add(a[i]);
            ls.add(a[n-i-1]);
        }

        if(n%2!=0)
        {
            ls.add(a[n/2]);
        }


        int max_sum = 0;

      
        for (int i = 0; i < n-1; ++i    ) 
        {
            max_sum = max_sum + Math.abs(ls.get(i)) - Math.abs(ls.get(i+1));          
        }

        max_sum = max_sum + Math.abs(ls.get(n-1) - ls.get(0));

        return max_sum;
    }
    public static void main(String[] args) 
    {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
            
            
        }


        System.out.println(max_abs(a,n));

        sc.close();
        
        
    }
}
