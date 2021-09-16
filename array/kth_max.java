/**
 * kth_max
 */
import java.util.Arrays;
import java.util.Scanner;


public class kth_max 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        
        int arr[] = new int[length]; 

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = input.nextInt();            
        }

        System.out.println("Enter the target");

        int k = input.nextInt();

        int small = smallest(arr,k);

        System.out.println(small);

        input.close();

        
        
        
    }

    public static int smallest(int[] arr, int k) 
    {
        Arrays.sort(arr);
        int small = arr[k];
        return small;
    }

    
}