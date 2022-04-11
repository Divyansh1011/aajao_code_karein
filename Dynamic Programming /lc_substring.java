import java.util.Scanner;



public class lc_substring 
{
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
        System.out.println(lcs(a,b,n,m));

        s.close();

        
    }

    public static int lcs(char[] a, char[] b, int n, int m) 
    {
        
        int t[][] = new int[n+1][m+1];

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                if(i==0 || j==0)
                {
                    t[i][j] = 0;
                }
            }
        }

        int reuslt =0;
        for (int i = 1; i < n+1 ; i++) 
        {
            for (int j = 1; j < m+1; j++) 
            {
                if(a[i-1] == b[j-1])
                {
                    t[i][j] = 1 + t[i-1][j-1];
                    reuslt = Integer.max(reuslt, t[i][j]);
                }
                else
                {
                   t[i][j] = 0;
                }
                
            }
            
        }
        return reuslt;
    }
    
}
