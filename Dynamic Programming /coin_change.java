public class coin_change 
{
    public static void main(String[] args) 
    {
        int arr[] = { 1, 2, 3 };
        int m = arr.length;
     
        System.out.println(count(arr, m, 4));

        
    }

    public static int count(int[] coins, int m, int sum) 
    {
        int dp[][] = new int[m+1][sum+1];

        dp[0][0] = 1;

        for (int j = 1; j <=sum; j++) 
        {
            dp[0][1] = 0;
        }

        for (int k = 1; k < m+1; k++) 
        {
            for (int j = 0; j < sum+1; j++) 
            {
                if(coins[k-1] <= j)
                {
                    dp[k][j] = dp[k][j - coins[k-1]] + dp[k-1][j]; 
                }
                else
                {
                    dp[k][j] = dp[k-1][j];
                }
                
            }
            
        }

        return dp[m][sum];
    }
    
}
