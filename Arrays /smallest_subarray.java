import java.util.Scanner;

//Use sliding Window technique
//Two pointer technique
//empty subarray from index 0 
//add elements to the subarray till the sum < x 
//if the subarray sum > x remove the elements from the current subarray 
//the move the window by 1 index 
//Maintain a variable for the minimum length of the subarray 

public class smallest_subarray 
{
    public static void main(String[] args) 
    {
        Scanner  s = new Scanner(System.in);

        int length = s.nextInt();

        int arr[] = new int[length];
        int x = s.nextInt(); //the number given as input 

        for (int i = 0; i < length; i++) 
        {
            arr[i] = s.nextInt();
        }


        System.out.println(subarray(arr, length, x));


        s.close();
        
        
    }

    //Brute force soltuon --> is to use the two nesterd loops 
    public  static int subarray(int arr[], int length, int x) 
    {
        int curr = 0;
        int sum = 0 ;
        int end = 0;
        int min = Integer.MAX_VALUE;

        while (curr <= end &&  end< length ) 
        {
            while(sum <=x && end< length)
            {
                sum += arr[end++];
            }
            while (sum>x && curr < end) 
            {
                min = Math.min(min, end -1);
                sum -= arr[curr];
                curr++;
            }
            
        }

      return min;
    }
    
}
