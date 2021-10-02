import java.util.*;
public class even_digits 
{

    //Input: nums = [12,345,2,6,7896]
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();

        int arr[] = new int[length];


        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = s.nextInt();
            
        }

        int count = findnumber(arr,length);

        System.out.println(count);

        System.out.println(digit(2345));

        s.close();


        
    }

    public static int findnumber(int arr[],int length) 
    {
        int count = 0;
        for (int i : arr) 
        {
            if(even(i))
            {
                count++;
            } 
        }

        return count;
        
    }

    public static boolean even(int num)
    {
        int digits = digit(num);

        if(digits %2 == 0)
        {
            return true;

        }

        return false;

    }

    public static int digits2(int num ) 
    {
        return (int)(Math.log10(num)+1);   //shortcut method to find the digits of the number 
        
    }

        public static int digit(int num)
        {
            int count = 0;

            if(num<0)
            {
                num = num * -1;
            }

            if(num == 0)
        {
            return 1;
        }

            while (num>0) 
            {
                count++;
                num = num/10;
            }

            return count;
        
        }
    
}
