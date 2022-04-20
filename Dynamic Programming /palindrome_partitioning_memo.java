import java.util.Scanner;
import java.util.Arrays;

public class palindrome_partitioning_memo 
{
    static int [][] dp = new int[100][100];

    public static boolean isPalindrome(String s, int i, int j)
    {
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int minParition(String s,int i, int j)
    {
        if(i>=j)
        {
            return 0;
        }

        if(isPalindrome(s,i,j))
        {
            return 0;
        }


        if(dp[i][j]!= -1)
        {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for(int k = i; k<= j-1;k++)
        {
            int temp = minParition(s, i, k) + minParition(s, k+1, j) + 1;
            min = Math.min(min, temp);
        }
        dp[i][j] = min;

        return min;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for(int []row : dp) 
        {
            Arrays.fill(row,-1);
        }

        System.out.println(minParition(s,0,s.length()-1));

        sc.close();

    }
}
