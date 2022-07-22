import java.util.HashMap;
import java.util.Map;

public class longest_nice_string 
{
    public String longestNiceSubstring(String s)
    {
        String maxString = "";
        for(int i = 0;i<s.length();i++)
        {
            for(int j = i+1;j<s.length();j++)
            {
                String sub = s.substring(i,j+1);
                if(isNice(sub) && sub.length() > maxString.length())
                {
                    maxString = sub;
                    
                }
                
            }
        }
        return maxString;
        
    }
    
    private boolean isNice(String str)
    {
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i = 0;i<str.length();i++)
        {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(Character.isLowerCase(entry.getKey()))
            {
                if(!map.containsKey(Character.toUpperCase(entry.getKey())))
                {
                    return false;
                }
            }
            if(!Character.isLowerCase(entry.getKey()))
            {
                if(!map.containsKey(Character.toLowerCase(entry.getKey())))
                {
                    return false;
                }
            }
        }
        return true;
        
        
        
    }
    public static void main(String[] args) {
        
    }
}

//Tags: Sliding Window,HashSet 