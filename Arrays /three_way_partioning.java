import java.util.Scanner;

public class three_way_partioning 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int array[] = new int[length];

        int a = s.nextInt();
        int b = s.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }

        threeWayPartition(array,a,b);

        for (int i = 0; i < array.length; i++) 
        {
            System.out.println(array[i] + " ");
            
        }

        s.close();  
        
    }
    

public static void threeWayPartition(int array[], int a, int b)
{
    // code here 
    
    int n = array.length;
    int start = 0 ;
    int end = n-1;
    
    for(int i = 0;i<= end;)
    {
        /*// If current element is smaller than
            // range, put it on next available smaller
            // position.
        */ 
        if(array[i] < a)
        {
            int temp = array[start];
            array[start] = array[i];
            array[i] = temp;
            start++;
            i++;
        }
        // If current element is greater than
       // range, put it on next available greater
    // position.
        else if(array[i] > b)
        {
            int temp = array[end];
            array[end] = array[i];
            array[i] = temp;
            end--;
        }
        else
        {
            i++;
        }
    }
   }
 }