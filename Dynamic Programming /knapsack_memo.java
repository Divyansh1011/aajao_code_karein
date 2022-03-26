public class knapsack_memo 
{
    static int max(int a, int b) 
    { 
      return (a > b) ? a : b; 
    }

    public static int knapsackRec(int wt[],int value[], int weight, int n,int [][]dp) 
    {
       

        if(n ==0 || weight ==0)
        {
            return 0;
        }
        if(wt[n-1]<= weight)
        {
            return dp[n][weight] = max(value[n-1] + knapsackRec(wt, value, weight - wt[n-1], n-1,dp), knapsackRec(wt, value, weight, n-1,dp));     
        }
        else
        {
            return dp[n][weight] = knapsackRec(wt, value, weight, n-1,dp);
        }
        
    }
    static int knapsack(int wt[], int value[],int weight,int n )
    {
        int dp[][] = new int[n+1][weight + 1];

        for ( int i = 0; i < n+1; i++) {
            for (int j = 0; j < weight+1; j++) 
            {
                dp[i][j] = -1;                
            }
        }
        return knapsackRec(wt, value, weight, n, dp);
    }
    public static void main(String[] args) 
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(knapsack(wt,val,W,n));
            
    }
    
}
