public class max_sum_2_non_overlaping_subarray {
    public int maxSumTwoNoOverlap(int[] nums, int x, int y) 
    {
        int n = nums.length;
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            if(i<x)
            {
                sum+= nums[i];
                dp1[i] = sum;                
            }
            else
            {
                sum += nums[i] - nums[i-x];
                dp1[i] = Math.max(dp1[i-1], sum);
            }
            
        }
        sum = 0;
        
         for(int i = n-1;i>= 0;i--)
        {
            if(i+y>=n)
            {
                sum += nums[i];
                dp2[i] = sum;
            }
             else
             {
                 sum += nums[i] - nums[i+y];
                 dp2[i] = Math.max(dp2[i+1], sum);
             }
            
        }
        
        int ans = 0;
        
        
        for(int i = x-1;i<n-y;i++)
        {
            ans = Math.max(ans, dp1[i] + dp2[i+1]);
            
        }
        
        int max1 = ans;
        
         dp1 = new int[n];
         dp2 = new int[n];
         sum = 0;
        for(int i = 0;i<n;i++)
        {
            if(i<y)
            {
                sum+= nums[i];
                dp1[i] = sum;                
            }
            else
            {
                sum += nums[i] - nums[i-y];
                dp1[i] = Math.max(dp1[i-1], sum);
            }
            
        }
        sum = 0;
        
         for(int i = n-1;i>= 0;i--)
        {
            if(i+x>=n)
            {
                sum += nums[i];
                dp2[i] = sum;
            }
             else
             {
                 sum += nums[i] - nums[i+x];
                 dp2[i] = Math.max(dp2[i+1], sum);
             }
            
        }
        
         ans = 0;
        for(int i = y-1;i<n-x;i++)
        {
            ans = Math.max(ans, dp1[i] + dp2[i+1]);
            
        }
        int max2 = ans;
        
        return Math.max(max2,max1);
        
        
        
        
    }
    public static void main(String[] args) {
        
    }
}
