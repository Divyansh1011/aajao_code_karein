import java.util.ArrayList;
import java.util.HashMap;

public class find_all_anagrams 
{
 public static void main(String[] args) {

    String s = "cbaebabacd"; 
    String p = "abc";

    HashMap<Character, Integer> map = new HashMap<>();
    HashMap<Character, Integer> smap = new HashMap<>();
    ArrayList<Integer> arr =new ArrayList<Integer>();

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
        arr.add(0);
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
            arr.add(l-p.length());
        }
    }
    System.out.println(smap);
    System.out.println(arr);
    


 }
    
}
