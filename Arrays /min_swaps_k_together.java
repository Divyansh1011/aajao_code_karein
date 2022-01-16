import java.util.Scanner;

/**
 * min_swaps_k_together
 * Used sliding window approach 
 * jahan sub array hota hai sliding widnow use karein 
 * 
 * two pointer algorigthm
 */
public class min_swaps_k_together {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();
        int k = s.nextInt();

        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

       System.out.println(getMinSwap(arr,k));
        s.close();  

        
        
    }

    public static int getMinSwap(int[] arr, int k) 
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] <= k) 
            {
                count++;
            }
        }

        //Unwanted elements in the window size of count 
        int bad  = 0;
        for (int i = 0; i < count; i++) 
        {
            if (arr[i] > k) 
            {
                ++bad;
                
            }
            
        }

        //for the current window
        int ans = bad;
        for (int i = 0,j = count; j<arr.length; ++i,++j) 
        {

            if (arr[i] > k) 
            {
                --bad;
            }

            if (arr[j] > k)
            {
                ++bad;
                
            }

            ans = Math.min(ans, bad);
            
        }

        return ans;
    }
}