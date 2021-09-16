import java.util.*;

public class sorting_1 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = s.nextInt();
        }
        sort012(arr,length);
        System.out.println("Array after the seggeration");
        printArray(arr,length);
        
        s.close();    
    }
        
    public static void sort012(int[] arr, int length) 
    {
        int lo = 0;
        int hi = length-1;
        int mid = 0;
        int temp = 0;
        while (mid<=hi) 
        {
            switch (arr[mid]) 
            {
                case 0:
                {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;   
                }
                    
                case 1:
                {
                    mid++;
                    break;
                }
                case 2:
                {
                    temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                    break;
                }
            }
            
        }

    }

    public static void printArray(int arr[],int length) 
    {
        for (int i = 0; i < length; i++) {
           
            System.out.println(arr[i]+" ");
            
        }

        System.out.println("");   
    }   
}
