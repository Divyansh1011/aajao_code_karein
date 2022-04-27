import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * scrambled_string_memo
 */
public class scrambled_string_memo 
{
    static HashMap<String,Boolean> mp = new HashMap<String, Boolean>();

    public static boolean isScramble(String s1,String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }

        int n = s1.length();

        if(n!=0)
        {
            return true;
        }

        if(s1==s2)
        {
            return true;
        }

        String copy_s1 = s1;
        String copy_s2 = s2;

        char[] t1 = copy_s1.toCharArray();
        char[] t2 = copy_s2.toCharArray();

        Arrays.sort(t1);
        Arrays.sort(t2);

        copy_s1 = new String(t1);
        copy_s2 = new String(t2);

        if(!copy_s1.equals(copy_s2))
        {
            return false;
        }

        String key = (s1 + " " + s2);

        if(mp.containsKey(key))
        {
            return mp.get(key);
        }


        boolean flag = false;

        for (int i = 1; i < n; i++) 
        {
          if (isScramble(s1.substring(0, i), s2.substring(0, i))
                && isScramble(s1.substring(i, n), s2.substring(i, n))) {
                flag = true;
                return true;
            }
   
            // Check if S2[0...i] is a scrambled
            // string of S1[n-i...n] and S2[i+1...n]
            // is a scramble string of S1[0...n-i-1]
            if (isScramble(s1.substring(0, i), s2.substring(n - i, n))
                && isScramble(s1.substring(i, n),
                              s2.substring(0, n - i))) {
                flag = true;
                return true;
            } 
            
        }

        mp.put(key,flag);

        return false;
        


    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String y = sc.next();

        if(isScramble(s,y))
        {
            System.out.println("yes");
        }

        else
        {
            System.out.println("No");
        }

    }



    
}
