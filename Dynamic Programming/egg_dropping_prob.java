import java.util.Scanner;

/**
 * egg_dropping_prob
 */
public class egg_dropping_prob 
{
    public static int solve(int e,int f)
    {
        if(f==0 || f == 1)
        {
            return f;
        }
        if(e==0)
        {
            return e;
        }

        int min = Integer.MAX_VALUE;
        int temp;
        for(int k = 1; k<=f; k++) 
        {
             temp = 1 + Math.max(solve(e-1, f-1), solve(e, f- k));
             if(temp < min)
             {
                 min = temp;
             }
        }



        return min+1;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int e = s.nextInt();
        int f = s.nextInt();

        System.out.println(solve(e,f));
    }

    
}
