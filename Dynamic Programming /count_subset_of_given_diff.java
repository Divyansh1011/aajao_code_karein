public class count_subset_of_given_diff
{
    public static void main(String[] args) 
    {
        int arr[] = {1,1,1,1,1};
        int diff = 3;
        int n = arr.length;

        System.out.println(findSubset(arr, diff,n));
        
    }

    public static int findSubset(int[] arr, int diff,int n) 
    {
        int sum = 0;
        
        for (int i = 0; i < n ; i++) 
        {
            sum+= arr[i];
        }
        int s = 0;
         s = (diff + sum) / 2;

        return countsubsetSum(arr,s,n);


    }

    public static int countsubsetSum(int[] arr, int s1, int n) 
    {
        int dp[][] = new int[n+1][s1+1];

        for (int i = 0; i < n+1; i++) 
        {
            for (int j = 0; j < s1 +1; j++) 
            {
                if(i ==0)
                {
                    dp[i][j] = 0;
                }
                if(j==0)
                {
                    dp[i][j] = 1;
                }

                
            }
            
        }

        for (int i = 1; i < n+1; i++) 
        {
            for (int j = 1; j < s1+1; j++) 
            {

                if(arr[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                }
                else if (arr[i-1]>j || arr[i-1] == 0) {
                    dp[i][j] = dp[i-1][j];
                    
                }           
            }   
            
        }

        return dp[n][s1];

        
    }
    
}
