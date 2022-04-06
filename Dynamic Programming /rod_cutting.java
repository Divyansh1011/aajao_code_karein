public class rod_cutting 
{
    public static void main(String[] args) 
    {
        int price [] = new int []{1,5, 8, 9, 10, 17, 17, 20};
        int n = price.length;
        int length[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            length[i] = i +1;            
        }

        int max_len = n;
        System.out.println("max obtained value is" + un_kp(price, length, n, max_len));

        un_kp(price, length, n, max_len);


        
    }

    public static int un_kp(int[] price, int[] length, int n, int max_len) 
    {
        int dp[][] = new int[n+1][max_len +1];

        for ( int i = 0; i < n+1; i++) 
        {
            for (int j = 0; j < max_len +1; j++) 
            {
                if(i==0)
                {
                    dp[i][j] = 0;
                }
                if(j==0)
                {
                    dp[i][j] = 0;
                }
            }
        }

        if(n==0 || max_len == 0)
        {
            return 0;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < max_len+1; j++) 
            {
                if(length[i-1] <=j)
                {
                    dp[i][j] = Math.max(price[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][max_len];


    }
    
}
