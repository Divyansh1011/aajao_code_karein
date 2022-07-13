import java.util.HashMap;

public class min_window_substring {
    public String minWindow(String s, String t) 
    {
        if(t.length() > s.length())
        {
            return "";
        }
        if(t =="")
        {
            return "";
        }
        HashMap<Character,Integer> window = new HashMap<Character,Integer>();
            HashMap<Character,Integer> T = new HashMap<Character,Integer>();
        
        for(Character ch: t.toCharArray())
        {
            T.put(ch,T.getOrDefault(ch,0) + 1);            
        }
        
        int have = 0;
        int need = t.length();
        String ans = "";
        int i = -1;
        int j = -1;
        
        while(true)
        {
            boolean flag1 = false;
            boolean flag2 = false;
            
            
            while(i<s.length() - 1  && have<need)
            {
                i++;
                char ch = s.charAt(i);
                window.put(ch,window.getOrDefault(ch,0) + 1);
                //checking the frequency of each letter stored in hashmap
                if(window.getOrDefault(ch,0) <= T.getOrDefault(ch,0))
                {
                    have++;
                }
                flag1 = true;
            }
            
            while(j<i && need == have)
            {
                String p = s.substring(j+1,i+1);
                if(ans.length() == 0 || p.length()<ans.length())
                {
                    ans = p;
                }
                
                j++;
                char ch = s.charAt(j);
                if(window.get(ch) == 1)
                {
                    window.remove(ch);
                }
                else
                {
                    window.put(ch,window.get(ch) - 1 );
                }
                if(window.getOrDefault(ch,0) < T.getOrDefault(ch,0))
                {
                    have--;
                }
                
                flag2 = true;
                
            }
            
            if(flag1 == false && flag2 == false)
            {
                break;
            }
        }
        return ans;
        
        
        
    }
    public static void main(String[] args) {
        
    }
}
