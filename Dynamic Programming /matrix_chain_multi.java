import java.util.Scanner;

public class matrix_chain_multi 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++) 
        {
            arr[i] = s.nextInt();
    }

        System.out.println(solve(arr,1,n-1));
    }

    public static int solve(int arr[], int i,int j)
    {
        if(i>=j)
        {
            return 0;
        }
        
        int min = Integer.MAX_VALUE;

        for(int k = i; k <=j-1; k++) 
        {
            int tempAns = solve(arr,i,k) + solve(arr,k+1,j) + (arr[i-1] * arr[k] * arr[j]);

            if(tempAns < min)
            {
                min = tempAns;
            }
            
        }

        return min;
    }
    
}

