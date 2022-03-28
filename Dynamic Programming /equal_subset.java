public class equal_subset 
{

    public static  boolean  issubsetsum(int arr[],int n,int sum)
    {

        if(sum==0)
        {
            return true;
        }
        if(sum!=0 && n==0 )
        {
            return false;
        }     

        if (arr[n-1] <=sum)
        {
            return issubsetsum(arr, n-1, sum) || issubsetsum(arr, n-1, sum - arr[n-1]);
            
        }
        return issubsetsum(arr, n-1, sum);
    }

    public static boolean findPartition(int arr[] , int n )
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum+= arr[i];
        }

        if (sum%2==0) 
        {
            issubsetsum(arr,n, sum/2);
            
        }

            return true;
    }

    public static void main(String[] args)
    {
        int arr[] = { 3, 1, 5, 9, 12 };
        int n = arr.length;

        if (findPartition(arr, n)==true) 
        {
            System.out.println("can be divided into two");

        }
        else
        {
            System.out.println("can be not divided into two");
        }
            
    }
    
}
