import java.util.Arrays;
import java.util.Scanner;

/**
 * bool_parenthesis
 */
public class bool_parenthesis 
{
    public static boolean isScramble(String S1, String S2)
    {
        if(S1.length() != S2.length())
        {
            return false;
        }

        if(S1.equals(S2))
        {
            return true;
        }

        char [] temparray1 = S1.toCharArray();
        char [] temparray2 = S2.toCharArray();

        Arrays.sort(temparray1);
        Arrays.sort(temparray2);

        String copy_S1 = new String(temparray1);
        String copy_S2 = new String(temparray2);

        if(!copy_S1.equals(copy_S2))
        {
            return false;
        }



        int n = S1.length();
        if(n==0)
        {
            return true;
        }
        for(int i = 1; i < n; i++) 
        {
           if (isScramble(S1.substring(0, i),
                       S2.substring(0, i)) &&
            isScramble(S1.substring(i, n),
                       S2.substring(i, n)))
        {
            return true;
        }
 
        // Check if S2[0...i] is a scrambled
        // string of S1[n-i...n] and S2[i+1...n]
        // is a scramble string of S1[0...n-i-1]
        if (isScramble(S1.substring(n - i, n),
                       S2.substring(0, i)) &&
            isScramble(S1.substring(0, n - i),
                       S2.substring(i, n)))
        {
            return true;
        } 
            
        }

        return false;
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        
        if(a.length()==0 && b.length() ==0)
        {
            System.out.println(true);

        }

        System.out.println(isScramble(a,b));

        s.close();
    }

}
 
