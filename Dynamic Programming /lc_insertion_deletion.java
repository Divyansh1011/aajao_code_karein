import java.util.Scanner;

public class lc_insertion_deletion 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String y = s.nextLine();

        char a[] = x.toCharArray();
        char b[] = y.toCharArray();
        int n = a.length;
        int m = b.length;

        lcs(a,b,n,m);

        s.close();
        
        
    }

    public static void lcs(char[] a, char[] b, int n, int m) 
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

        for (int i = 1; i < n+1 ; i++) 
        {
            for (int j = 1; j < m+1; j++) 
            {
                if(a[i-1] == b[j-1])
                {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else
                {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
                
            }
            
        }
        System.out.println(n - t[n][m]);
        System.out.println(m - t[n][m]);
    }
    

    }
    

