public class min_diff 
{
    public static void main(String[] args) 
    {

        int arr[] = { 3, 1, 4, 2, 2, 1 };
        int n = arr.length;
        System.out.print("The minimum difference"
                         + " between two sets is "
                         + findMin(arr, n));


        
    }

    public static int  findMin(int[] arr, int n) 
    {
        int sum = 0;

        for (int i = 0; i < n; i++) 
        {
            sum+= arr[i];
            
        }

        boolean t[][] = new boolean[n+1][sum+1];

        for (int i = 0; i < n+1 ; i++) 
        {
            for (int j = 0; j < sum+1; j++)
            {
                if(i==0)
                {
                    t[i][j] = false;
                }
                if(j==0)
                {
                    t[i][j] = true;
                }
            }            
        }

        for (int i = 1; i < n+1; i++) 
        {
            for (int j = 1; j < sum+1; j++) {
                
                if(arr[i-1] <=j)
                {
                    t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]];
                }
                else
                {
                    t[i][j] = t[i-1][j];
                }
            }
            
        }

        int diff = Integer.MAX_VALUE;
        for (int i = sum/2; i >=0 ; i--) 
        {
            if(t[n][i] == true)
            {
                diff = Math.min(sum - 2* i, diff);
            }

            
        }
        return diff;


        
    }
    
}
