import java.util.HashMap;
import java.util.Map;

public class substrings_of_size_k {
    public int countGoodSubstrings(String s) 
    {
        int count = 0;
        int windowstart = 0;
        int k = 3;
        Map<Character,Integer> frequency = new HashMap<>();//to store the frequency of the characters
        
        for(int i = 0;i<s.length();i++)//traversing the string
        {
            char ch = s.charAt(i);
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);//hashing the frequency of the character on the run 
                
            
            if(i>k-1)// moving the window accordingly 
            {
                ch = s.charAt(windowstart); 
                frequency.put(ch,frequency.get(ch)-1);
                if(frequency.get(ch) ==0)
                {
                    frequency.remove(ch);
                }
                          windowstart++;
                
            }
  
             if(frequency.size() == k)
        {
            count++;
        }
        }
        
       
        return count;
    }

    public static void main(String[] args) {
        
    }
}
