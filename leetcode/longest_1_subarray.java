public class longest_1_subarray {


    public int longestSubarray(int[] nums) 
    {
        int i = 0;
        int j = 0;
      //  int count = 0;
        int k= 1;
       // int max = 0;
        
        while(j<nums.length)
        {
            if(nums[j] == 0)
            {
                k--;
               
            }
            
            if(k<0 && nums[i++] == 0)
            {
                k++;
            }
             j++;
        }
        
        return j-i-1;
        
        
        
        
}
    public static void main(String[] args) {
        
    }
}


/*
 * Given a binary array nums, you should delete one element from it.
    Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

    Sliding window technique 
    variable size

 */