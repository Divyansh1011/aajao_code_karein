public class maximum_subarray_k_average 
{
    public double findMaxAverage(int[] nums, int k) 
    {
    double average = 0;
    int i = 0;
    int j = 0;
    double max = 0;
    while(j< nums.length)
    {
        
        average += nums[j];
        if(j-i + 1 < k)
        {   
            j++;
        }
        else if(j-i+1==k)
        {
            max = Math.max(max,average);
              average = average - nums[i];
              i++;
            j++;    
        
     
        }   
       
        
    }
  
    return max/k;
}
    public static void main(String[] args) {
        
    }
    
}
