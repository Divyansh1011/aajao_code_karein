import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class group_anagram 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<HashMap<Character,Integer>, ArrayList<String>> map = new HashMap<HashMap<Character,Integer>,ArrayList<String>>();
       
        for(String sr: strs )
        {
            HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
            
            for(int i = 0;i<sr.length();i++)
            {
                if(mp.containsKey(sr.charAt(i)))
                {
                    int x = mp.get(sr.charAt(i));
                    mp.put(sr.charAt(i),++x);
                }
                else
                {
                    mp.put(sr.charAt(i),1);
                }
                
            }
            
            if(map.containsKey(mp))
            {
                map.get(mp).add(sr);
            }
            else
            {
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(sr);
                map.put(mp,temp);
            }
            
            
        }
        
        List<List<String>> result = new ArrayList<>();
        for(HashMap<Character,Integer> temp : map.keySet())
        {
            result.add(map.get(temp));
        }
        return result;
        
    }
    public static void main(String[] args) {

    }    
}
