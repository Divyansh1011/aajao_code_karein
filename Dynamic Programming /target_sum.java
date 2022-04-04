public class target_sum 
{
    public static int findSum(int arr[], int diff,int n)
    {
        int sum = 0;
        int cmt = 0;

        for (int i = 0; i < n; i++) 
        {
            sum = sum + arr[i];
            if(arr[i] == 0)
            {
                cmt += 1;

            }
    
        }

        int s = 0;
        s = Math.abs( (diff+ sum) / 2);
        return countsubsetsum(arr,diff,cmt,s,sum,n);
    }
    public static int countsubsetsum(int[] arr, int diff,int cmt, int s, int sum,int n) 
    {
        int dp[][] = new int[n+1][s+1];

        for (int i = 0; i <n+1 ; i++) 
        {
            for (int j = 0; j < s+1; j++) 
            {
                if(i==0)
                {
                    dp[i][j] = 0;
                }
                if(j==0)
                {
                    dp[i][j] = 1;
                }
                
            }
        }

        if(s> diff|| (diff+s)%2 !=0)
        {
            return 0;
        }

        for (int i = 1; i < n+1; i++) 
        {
            for (int j = 1; j < s+1; j++) 
            {
                if(arr[i-1] == 0)
                {
                    dp[i][j] = dp[i-1][j];
                }
                else if(arr[i-1]>j)
                {
                    dp[i][j] = dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                }
            }
        }

            return   dp[n][s];      
    }
   
    public static void main(String[] args) 
    {
        int arr [] = {0,0,0,0,0,0,1};
        int target = 1;

        System.out.println(findSum(arr, target, 7));
        
    }
    
}
