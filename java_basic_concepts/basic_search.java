import java.util.*;
public class basic_search 
{
    public static void main(String[] args) 
    {
        int arr [] = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = s.nextInt();
        }
        System.out.println("the value to be searched for");
        int target = s.nextInt();

        int n = linearSearch(arr, target);
        System.out.println(n);

        s.close();

        
    }

    public static int linearSearch(int [] arr, int target)
    {
        if (arr.length ==0) 
        {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i] == target)
            {
                return i; //returning the target when matched 
            }
            
        }

        return -1; //when no target is  matched this will be returned 

    }
    
}
