import java.util.Arrays;

public class minimum_difference_highest_lowest_k_score 
{
    public int minimumDifference(int[] nums, int k) 
    {
        if(nums.length == 1)
        {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int diff = 0;
        int min = Integer.MAX_VALUE;
        
        for(int end = k-1;end<nums.length;end++)
        {
            int dif = nums[end] - nums[end-(k-1)];
            min = Math.min(min,dif);
            
        }
        return min;
        
        
        
        
    }
    public static void main(String[] args) {
        
    }
    
}
