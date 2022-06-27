public class longest_palindrome {
    public int longestPalindrome(String s) 
    {
        int charCounts[] = new int[128];
        for(Character ch: s.toCharArray())
        {
            charCounts[ch] ++;
        }
        
        int result = 0;
        
        for(Integer it: charCounts)
        {
            result+= it/2*2;
            if(result %2==0 && it % 2 == 1)
            {
                result+=1;
            }
        
    }
        return result;
}

    public static void main(String[] args) {
        
    }
}
