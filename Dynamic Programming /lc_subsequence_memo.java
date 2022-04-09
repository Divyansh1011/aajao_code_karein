import java.util.Arrays;
import java.util.Scanner;

public class lc_subsequence_memo 
{
    static int t[][] = new int[1001][1001];
    public static void main(String[] args) 
    {
        String x;
        String y;

        Scanner s = new Scanner(System.in);

        x = s.nextLine();
        y = s.nextLine();
        char a[] = x.toCharArray();
        char b[] = y.toCharArray();
        int n = a.length;
        int m = b.length;
        for (int[] row : t)
            Arrays.fill(row, -1);

        System.out.println(lcs_memo(a,b,n,m));
       s.close();

          
        
    }
    public static int lcs_memo(char[] a, char[] b, int n, int m) 
    {
        if(n==0 || m ==0)
        {
            return 0;
        }
        if(t[n][m] != -1)
        {
            return t[n][m];
        }
        if(a[n-1] == b[m-1]) 
        {
            return t[n][m] = 1 + lcs_memo(a,b,n-1,m-1);
        }
        else
        {
            return t[n][m] = Math.max(lcs_memo(a, b, n, m-1), lcs_memo(a, b, n-1, m));
        }

        


        

    }


    
}
