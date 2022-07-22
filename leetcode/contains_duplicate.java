import java.util.HashMap;

public class contains_duplicate 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        if(nums.length == 1)
        {
            return false;
        }
        
        for(int i = 0;i<nums.length;i++)
        {
             if(map.containsKey(nums[i]))
             {
                   if(Math.abs(i- map.get(nums[i])) <=k)
            {
                return true;
            }
                 
             }
          
              map.put(nums[i],i);
        }
        return false;
        
        }

    public static void main(String[] args) {
        
    }
}
