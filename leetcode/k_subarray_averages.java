public class k_subarray_averages {

    public int[] getAverages(int[] nums, int k) 
    {
        int n = nums.length;
        
        long prefix[] = new long[n];
        
        prefix[0] = nums[0];
        
        for(int i = 1;i<n;++i)
        {
            prefix[i] = prefix[i-1] + nums[i];
        }
        
     
      
        int [] res = new int[n];
        
        for(int i = 0;i<n;i++)
        {
            if(i<k || i+k>=n)
            {
                res[i] = -1;
            }
            else
            {
                long prevsum = 0;
                if(i>k)
                {
                    prevsum = prefix[i-k-1];
                }
                
                long currsum = prefix[i+k] - prevsum;
                long temp = currsum/ (2*k+1);
                res[i] = (int) temp;
                
                
                
            }
        }
        return res;
        
        
        
    }
    public static void main(String[] args) {
        
    }
}
