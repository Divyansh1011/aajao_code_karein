import java.util.Arrays;
import java.util.Scanner;

public class matrix_chain_multi_memo
{
    static int[][] dp = new int[100][100];
   
    public static int matrixChainMemoised(int arr[],int i, int j)
    {
        if(i==j)
        {
            return 0;
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        dp[i][j] = Integer.MAX_VALUE;

        for(int k = i; k<=j-1;k++) 
        {
            dp[i][j] = Math.min(dp[i][j], matrixChainMemoised(arr,i,k) + matrixChainMemoised(arr,k+1,j) + (arr[i-1]*arr[j] * arr[k]));
        }
        return dp[i][j];

    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int arr[]= new int[n];

        for(int i = 0; i < arr.length; i++) 
        {
            arr[i] = s.nextInt();            
            
        }

        for(int []row : dp) 
        {
            Arrays.fill(row,-1);
        }

        System.out.println(MatrixChainOrder(arr,n));
        s.close();

    }

    public static int MatrixChainOrder(int arr[],int n)
    {
        int i = 1;
        int j = n-1;

        return matrixChainMemoised(arr,i,j);
    }

}

