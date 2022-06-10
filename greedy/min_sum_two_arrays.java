import java.util.Arrays;
import java.util.Scanner;

/**
 * min_sum_two_arrays
 */
public class min_sum_two_arrays {


    static int minSolve(int a[], int b[], int n)
    {
        Arrays.sort(a);
        Arrays.sort(b);

        int res = 0;

        for (int i = 0; i < n; i++) 
        {
            res += Math.abs(a[i]) - Math.abs(b[i]);

            
        }
            return res;
    }

    public static void main(String[] args) 
    {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) 
        {
            b[i] = sc.nextInt();
            
        }

        System.out.println(minSolve(a,b,n));
        sc.close();

        
        
    }
}