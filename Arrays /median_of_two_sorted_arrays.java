import java.util.Scanner;

/**
 * median_of_two_sorted_arrays
 */

 //Brute Force Approach 

public class median_of_two_sorted_arrays 
{

static int getMedian(int arr1[], int arr2[], int n, int m)
{
    int i = 0;
    int j = 0;
    int count;

    int m1 = -1;
    int m2 = -1;

    if((m+n) % 2 == 1)
    {
        for (count = 0; count <= (n+m)/2; count++) 
        {

            if (i != n && j != m ) 
            {
                m1 = (arr1[i] > arr2[j] ? arr2[j++] : arr1[i++]);
                
            }
            else if (i<n)
            {
                m1 = arr1[i++];
            }

            else
            {
                m1 = arr2[j++];
            }
            
        }
        return m1;
    }

    else
    {
        for (count = 0; count < n+m/2; count++) 
        {
            m2 = m1;

            if (i != n && j != m ) 
            {
                m1 = (arr1[i] > arr2[j] ? arr2[j++] : arr1[i++]);
                
            }
            else if (i<n)
            {
                m1 = arr1[i++];
            }

            else
            {
                m1 = arr2[j++];
            }
            
        }

    return (m1 + m2) / 2;
    }
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

   System.out.println(getMedian(arr1,arr2,n,m));

 }
}
