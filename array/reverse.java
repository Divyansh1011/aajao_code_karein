
import java.util.Scanner;

public class reverse {

    public static void printarray(int a[]) 
    {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
            
        }
        System.out.println();
        
    }

    public static void reverse_array(int a[], int start, int end) 
    {
        int temp;
        while(start<end)
        {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;

        }   
    }

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        int a[] = new int[length];

        for (int i = 0; i < a.length; i++) 
        {
            a[i] = input.nextInt();    

        }
        int start = 0;
        int end = length -1;

        printarray(a);
        reverse_array(a, start,end);
        printarray(a);

        input.close();
        
    }
    
}
