import java.util.Scanner;

//Applied Linear Search 
//stored min and max value 
//compared every vlaue in the arry by for loop 
//o(n) time complexity 

public class max_min {
    static class Pair
    {
        int max;
        int min;
    }


    static Pair getMinMax(int arr[], int n)
    {
        Pair minMax = new Pair();
        

        if(n==1)
        {
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }

        if(arr[0] > arr[1])
        {
            minMax.max = arr[0];
            minMax.min = arr[0];
            
        }
        else
        {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

        for (int j = 2; j < n; j++) 
        {
            if(arr[j]>minMax.max)
            {
                minMax.max = arr[j]; 
            }
            else if(arr[j]<minMax.min)
            {
                minMax.min = arr[j];
            }
        }

        return minMax;

    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = s.nextInt();
            
        }
        Pair minmax = getMinMax(arr, n);
        System.out.println(minmax.min);
        System.out.println(minmax.max);

        s.close();        
    }

}
