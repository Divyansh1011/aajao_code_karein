/**
 * find_k_beauty_number
 */
public class find_k_beauty_number 
{
    public int divisorSubstrings(int num, int k) 
    {
        String n = Integer.toString(num);
        int start = 0;
        int count = 0;
        for(int end = k;end<=n.length();end++)
        {
            int divisor = Integer.parseInt(n.substring(start,end));
              start++;
            if(divisor!=0 && num%divisor == 0)
            {
                count++;
            }            
        }
        
        return count;
        
        
        
    }

    public static void main(String[] args) {
        
    }
}

//Sliding window technique 
/*
 * Problem Statement: FInd out the combination of K numbers that can be a divisor at the same time which is the combination of the integers 
 * the idea here is to to traverse the window over the array to check if the characters in that particular window of k size and check if the whooe number gets
 * divided by the characters in that window so we take the substring of the window check if the remainder is zero if yes then count increases by 1 
 * to move the window in front start index increases by 1 
 * TC o(N)
 * SC O(1)
 */