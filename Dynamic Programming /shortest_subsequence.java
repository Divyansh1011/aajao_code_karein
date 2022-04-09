import java.util.Scanner;

public class shortest_subsequence 
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
        int n = x.length();
        int m = y.length();
        int total = n + m;
       System.out.println(lcs(a,b,n,m,total));  



        s.close();        
    }

    public static int lcs(char[] x, char[] y, int n, int m,int total) 
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
                if(x[i-1] == y[j-1])
                {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else
                {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
                
            }
            
        }
        return total - t[n][m];



    }
    
}
