import java.util.Scanner;

public class min_max_recursion 
{
    public static int findMinRec(int A[], int n)
    {
      if(n == 1)
        return A[0];
         
        return Math.min(A[n-1], findMinRec(A, n-1));
    }
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int arr[] = new int[n];
     for(int i = 0 ;i<n;i++)
       {
           arr[i] = sc.nextInt();
        }
        System.out.println(findMinRec(arr, n));
        sc.close();
   }
    
}
