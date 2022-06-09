import java.util.Arrays;
import java.util.Scanner;

/**
 * max_sum_after_k_negations
 */
public class max_sum_after_k_negations 
{
    static long solve(long[] a, int n, int k) 
    {
        Arrays.sort(a);
        long sum = 0;
        int i = 0;
        while(i<n && k>0 && a[i]<0)
        {
            a[i] = a[i] * -1;
            k--;
            i++;
        }
        
        if(i == 0)
        {
            while(k>0)
            {
                a[i] = a[i] * -1;
                k--;
            }
        }
        if(k>0)
        {
            Arrays.sort(a);
          int temp=-1;
           while(k>0){
               a[0]=a[0]*temp;
               k--;
           }
            
        }
        
        for(int j = 0;j<n;j++)
        {
            sum+=a[j];
        }
        return sum;
        
    }
    public static void main(String[] args) 
    {
     
        int n ;
        int k ;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        long a[] = new long[n];

        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextLong();
            
        }
        long  x = solve(a,n,k);
        System.out.println(x);
        sc.close();


    }



    
}