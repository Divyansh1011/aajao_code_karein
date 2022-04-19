import java.util.Scanner;

public class palindrome_partition
{
    static boolean isPalindrome(String string, int i, int j)
  {
    while(i < j)
    {
      if(string.charAt(i) != string.charAt(j))
        return false; 
      i++;
      j--;
    }
    return true;
  }
 
  static int minPalPartion(String string, int i, int j)
  {   
    if( i >= j || isPalindrome(string, i, j) )
      return 0;
    int ans = Integer.MAX_VALUE, count;
    for(int k = i; k < j; k++)
    {
      count = minPalPartion(string, i, k) +
        minPalPartion(string, k + 1, j) + 1;
 
      ans = Math.min(ans, count);
    }
    return ans;
  }

    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);

        String str = s.next();

    System.out.println("Min cuts needed for "
                       + "Palindrome Partitioning is " + minPalPartion(str, 0, str.length() - 1));

                       s.close();
    }



}

