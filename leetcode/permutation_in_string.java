import java.util.ArrayList;
import java.util.HashMap;

public class permutation_in_string {
    public boolean checkInclusion(String p, String s) 
    {
          HashMap<Character, Integer> map = new HashMap<>();
    HashMap<Character, Integer> smap = new HashMap<>();
    ArrayList<Integer> arr =new ArrayList<Integer>();
        
        if(p.length()>s.length())
        {
            return false;
        }

    for(Character ch: p.toCharArray())
    {
        map.put(ch, map.getOrDefault(ch, 0) +1);
    }

    for(int i = 0;i<p.length();i++)
    {
        char c = s.charAt(i);
        smap.put(c, smap.getOrDefault(c,0)+1 );
    }

    System.out.println(map);
    System.out.println(smap);

    if(map.equals(smap) == true)
    {
        return true;
    }

    int l = p.length();

while(l< s.length())
    {
        char ch = s.charAt(l);
        smap.put(ch, smap.getOrDefault(ch, 0) + 1);

        char cha = s.charAt(l-p.length());
        if(smap.get(cha) == 1)
        {
            smap.remove(cha);
        }
        else
        {
            smap.put(cha, smap.get(cha) - 1);
        }
        l++;
        if(map.equals(smap) == true)
        {
          return true;
        }
    }
        return false;
        
    }
    public static void main(String[] args) {

    }
}
