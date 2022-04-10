import java.util.Scanner;

public class lc_palindrome 
{
    public static void main(String[] args) 
    {

        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
      
        int n = x.length();
    
       System.out.println(lps(x,n)); 

        s.close();

        
    }

    public static int lps(String x, int n) 
    {
        StringBuilder input1 = new StringBuilder();

        input1.append(x);

        StringBuilder rev = input1.reverse();

        String reverse = rev.toString();

        char a[] = reverse.toCharArray();
        char b[] = x.toCharArray();
        
        int t[][] = new int[n+1][n+1];

        for (int i = 0; i < t.length; i++) 
        {
            for (int j = 0; j < t.length; j++) {
                
            }
            
        }


        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(i==0 || j==0)
                {
                    t[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n+1 ; i++) 
        {
            for (int j = 1; j < n+1; j++) 
            {
                if(b[i-1] == a[j-1])
                {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else
                {
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
                
            }
            
        }


        return t[n][n];
    }
    
}
