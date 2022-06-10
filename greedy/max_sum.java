import java.util.Arrays;
import java.util.Scanner;

public class max_sum 
{
   static int Maximize(int arr[], int n)
    {
        Arrays.sort(arr);
        int i = 0;
        long sum = 0;
        while(i<n)
        {
            sum+= (long)arr[i] * i;
            i++;
            
        }
        long ans = sum%1000000007;
       return (int)ans;
        // Complete the function
        
    }   
    public static void main(String[] args) 
    {
        int n;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];

        for (int index = 0; index < n; index++) 
        {
            a[index] = sc.nextInt();
            
        }
        int max = Maximize(a,n);
        System.out.println(max);
        sc.close();




        
        
    }
    
}
