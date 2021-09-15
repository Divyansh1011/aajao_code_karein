import java.util.*;
public class basic_search_strings 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        String name = s.nextLine();

        System.out.println(Arrays.toString(name.toCharArray())); //character array 

        char target = s.next().charAt(0);

      boolean flag = search(name,target);

      System.out.println(flag);

      s.close();

    }

    static boolean search(String str,char target)
    {
        if(str.length() == 0)
        {
            return false;
        }

        for (int i = 0; i < str.length(); i++) 
        {
            if (target == str.charAt(i))
            {
                return true;
            }
            
        }

        return false;
    }
    
}
