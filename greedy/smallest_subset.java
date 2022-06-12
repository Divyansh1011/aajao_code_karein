import java.util.Arrays;
import java.util.Scanner;

public class smallest_subset {

    static int subset(int[] arr, int n) 
    {
       
        int curr_sum = 0;
        for (int i = 0; i < n; i++) 
        {
            curr_sum += curr_sum + arr[i];
        }

        curr_sum = curr_sum/2;
        Arrays.sort(arr);


        int sum = 0;
        int res = 0;

        for (int i = n-1; i >=0; i--) 
        {
            sum += arr[i];
            res++;
            
            if(sum > curr_sum)
            {
                return res;
            }
    
        }
        return res;
      

        
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(subset(arr,n));
        sc.close();
    }

    
}
