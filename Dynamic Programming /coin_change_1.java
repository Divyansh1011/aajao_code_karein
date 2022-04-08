public class coin_change_1 
{
    public static void main(String[] args) 
    {
        int coins[] =  {9, 6, 5, 1};
        int m = coins.length;
        int V = 11;
        System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );

        
    }

    public static int minCoins(int[] coins, int m, int v) 
    {
        int dp[][] = new int[m+1][v+1];

        //Initialization step
        for (int i = 0; i < m+1; i++) 
        {
            for (int j = 0; j < v+1; j++) 
            {
                if (i==0) 
                {
                    dp[i][j] = Integer.MAX_VALUE - 1;
                    
                }
                if (j==0)
                {
                    dp[i][j] = 0;
                    
                }
                
                
            }
        }
        for (int i = 1; i < v+1; i++) 
        {
            if(i%coins[0] == 0)
            {
                dp[1][i] = i/coins[0]; 

            }
            else
            {
                dp[1][i] = Integer.MAX_VALUE -1;
            }
            
        }

        for (int i = 1; i < m+1; i++) 
        {
            for (int j = 1; j < v+1; j++) 
            {
                if(coins[i-1] <= j)
                {
                    dp[i][j] = Math.min(dp[i][j-coins[i-1]], dp[i-1][j]);
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
                
            }
            
        }

        return dp[m][v];
    }
}
