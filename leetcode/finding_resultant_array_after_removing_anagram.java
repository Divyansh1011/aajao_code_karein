import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class finding_resultant_array_after_removing_anagram {

    public boolean checkAnagram(String s, String t)
    {
        HashMap<Character,Integer> hs = new HashMap<>(); // To store the frequency of each letter of the string S
        HashMap<Character, Integer> h = new HashMap<>(); // To store the frequency of each letter fo the string T
        if(s.length() > t.length())//Checking the length if the length of one of the string is more then its false it is supposed to be same 
        {
             return false;
        }
        for(Character ch: s.toCharArray()) // Running an iterator ch of character type on String s which is changed to char Array and storing the characters same to the hashmap 
        {
				hs.put(ch, hs.getOrDefault(ch,0) + 1); // checking if the character already exist or not in the hashmap if not increasing the value of the freuency by 1
        }
        
        for(Character c: t.toCharArray()) // same as above for the string t
        {
            h.put(c,h.getOrDefault(c,0) +1);
        }
        if(h.equals(hs) == true) //checking if the maps are equal or not if they are returned true for the same 
        {
            return true;
        }
        return false;
    }

    public List<String>  removeAnagram(String[] words)
    {
        List<String> res = new ArrayList<>(); 
        String prev = "";

        for(int i = 0;i<words.length;i++)
        {
            if(checkAnagram(words[i], prev) == false)
            {
                res.add(words[i]);
                prev = words[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
