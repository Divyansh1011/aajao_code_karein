import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class median_of_two_sorted_array_binary_search 
{
    static double Median(int a[], int b[])
    {
        int n = a.length;
        int m = b.length;
        if(n>m)
        {
            return Median(b, a);//swap to make a smaller 
        }

        int start = 0;
        int end = n;
        int midmergedarray = (n+m+1)/2;
        
        while (start<=end) 
        {
            int mid = (start + end)/ 2;
            int leftAsize = mid;
            int leftBsize = midmergedarray - mid;

            int leftA = (leftAsize > 0)? a[leftAsize - 1] : Integer.MIN_VALUE;

            int leftB = (leftBsize > 0)? b[leftBsize - 1]: Integer.MIN_VALUE;
            int rightA = (leftAsize < n)? a[leftAsize] : Integer.MAX_VALUE;
            int rightB = (leftBsize < m) ? b[leftBsize] : Integer.MAX_VALUE;

            if(leftA <= rightA && leftB<= rightA)
            {
                if((m + n) % 2 ==0)
                {
                    return (Math.max(leftA, leftB)+ Math.min(rightA, rightB))/2;
                }
                return Math.max(leftA, leftB);
            }
            else if(leftA > rightB)
            {
                end = mid - 1;

            }
            else
            {
                start = mid+1;
            }
            
        }
        return 0.0;
    }
    public static void main(String[] args) 
    {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for (int i = 0; i < arr1.length; i++) 
        {
            arr1[i] = s.nextInt();        
        }

        for (int j = 0; j < arr2.length; j++) 
        {
            arr2[j] = s.nextInt();        
        }
         s.close();

         System.out.println("Median of the two arrays are");
            System.out.println(Median(arr1, arr2));
        
    }
}
