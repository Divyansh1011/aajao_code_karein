import java.util.Arrays;
import java.util.Scanner;

//sort the array from the [0 - n-1]
//find the subarray for which the diffrence between the mmax and min  distribution is minimum 
public class choclate_distribution 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        int m = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = s.nextInt();
        }

        System.out.println(min_distribution(arr,m, n));

        s.close();        
    }
    public static int min_distribution(int[] arr,int m ,  int n) 
    {
        int min_diffrence  = Integer.MAX_VALUE;

        Arrays.sort(arr);

        if(m == 0 || n ==0)
        {
            return 0;
        }

        if(n<m)
        {
            return -1;
        }

        for (int i = 0; i + m-1 < n; i++)
        {
            int diff = arr[i + m - 1] - arr[i];

            if (diff < min_diffrence) 
            {
                min_diffrence = diff;
            }
        }

        return min_diffrence;
    }
    
}
