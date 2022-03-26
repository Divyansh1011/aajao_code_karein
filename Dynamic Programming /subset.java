public class subset 
{
    static boolean isSubSet(int set[], int sum, int n)
    {
        boolean t[][] = new boolean[n+1][sum+1];

        //Initialization step
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=sum; j++) 
            {
                if (i == 0) 
                {
                    t[i][j] = true;
                    
                }
                if (j == 0) 
                {
                    t[i][j] = false;
                    
                }
            }
        }

        //Choices 

        for (int i = 1; i < n + 1; i++) 
        {
            for (int j = 1; j < sum + 1; j++) 
            {
                if(set[i-1]<j)
                {
                    t[i][j] = t[i][j-set[i-1]] || t[i-1][j];
                }

                t[i][j] = t[i-1][j];
                
            }
        }

        return t[n][sum];

    }
    public static void main(String[] args) 
    {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        if (isSubSet(set, sum,n) == true)
            System.out.println("Found a subset"
                               + " with given sum");
        else
            System.out.println("No subset with"
                               + " given sum");

        

        
    }
    
}
