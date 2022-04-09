import java.util.Scanner;

public class lc_print 
{
    public static void main(String[] args) 
    {
        String x;
        String y;

        Scanner s = new Scanner(System.in);
        x = s.nextLine();
        y = s.nextLine();
        int n = x.length();
        int m = y.length();
        lcs(x,y,n,m);

        s.close();

        
    }

    public static void lcs(String a, String b, int n, int m) {
        int t[][] = new int[n+1][m+1];

      
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
                else if (a.charAt(i-1) == b.charAt(j-1))
                    t[i][j] = t[i-1][j-1] + 1;
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        int index = t[m][n];
        int temp = index;
  
        // Create a character array to store the lcs string
        char[] lcs = new char[index+1];
        lcs[index] = '\u0000'; // Set the terminating character
  
        // Start from the right-most-bottom-most corner and
        // one by one store characters in lcs[]
        int i = m;
        int j = n;
        while (i > 0 && j > 0)
        {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (a.charAt(i-1) == b.charAt(j-1))
            {
                // Put current character in result
                lcs[index-1] = a.charAt(i-1);
                 
                // reduce values of i, j and index
                i--;
                j--;
                index--;    
            }
  
            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (t[i-1][j] > t[i][j-1])
                i--;
            else
                j--;
        }
  
        // Print the lcs
        for(int k=0;k<=temp;k++)
            System.out.print(lcs[k]);
    }
   
}

    
