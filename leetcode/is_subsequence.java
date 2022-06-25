public class is_subsequence {

    public boolean isSubsequence(String s, String t) 
    {
        int n = s.length();
        int m = t.length();
        int j = 0;
        for(int i = 0; i< m && j<n;i++)
        {
            if(s.charAt(j) == t.charAt(i))
            {
                j++;
            }
        }
       
        return (j== n);
        
    }
    public static void main(String[] args) {
        
    }
}
