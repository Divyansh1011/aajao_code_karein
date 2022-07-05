
import java.util.Arrays;


public class unique_paths_dp_4 {
//memozied recursive solution 
    public int uniquePaths(int m, int n) 
    {
        int [][] dp = new int[m][n];

        for(int row[]: dp)
        {
            Arrays.fill(row, -1);
        }
    
        return helper(m-1,n-1,dp);
        
        
    }
    
    public int helper(int i,int j,int dp[][])
    {
         if(i>=0 && j>=0 && dp[i][j]!=-1)
        {
            return dp[i][j];
        }
         if(i==0 && j==0)
        	return 1;
        if(i<0)
            return 0;
        if(j<0)
            return 0;

      
        return dp[i][j] = helper(i-1,j,dp) + helper(i, j-1, dp);
        
    }
    public static void main(String[] args) {
        
    }
}
