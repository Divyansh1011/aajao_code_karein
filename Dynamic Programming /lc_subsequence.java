import java.util.Scanner;

public class lc_subsequence 
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

        if(n==0 || m==0)
        {
            return 0;
        }

        if(a[n-1] == b[m-1])
        {
            return 1 + lcs(a,b,n-1,m-1);
        }
        else
        {
            return Math.max(lcs(a, b, n, m-1), lcs(a, b, n-1, m));
        }

    }
    
}
