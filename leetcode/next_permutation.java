
import java.util.Arrays;
import java.util.Scanner;


public class next_permutation {

    public static void swap(int n[],int i, int min)
    {
        int temp = n[i];
        n[i] = n[min];
        n[min] = temp;
        
    }

    public static void nextPermutaiton(int n[], int length)
    {
        int i;

        for(i = length-1;i>0;i--)
        {
            if(n[i]>n[i-1])
            {
                break;
            }
        }

        if(i ==0)
        {

            System.out.println("Not Possible");;
        }
        else
        {
            int x = n[i-1];
        int min = i;

        for(int j = i+1;j<length;j++)
        {
            if(n[j] > x && n[j]<n[min])
            {
                min = j;
            }

        }

        swap(n, i-1, min);

        Arrays.sort(n, i,  length);

        for(int k = 0;k<length;k++)
        {
            System.out.println(n[k]);
        }
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int n[] = new int[length];

       // Vector<Integer> n = new Vector<Integer>(length);

        //Vector<Integer> n = new Vector<Integer> ();

        for(int i = 0 ; i<n.length;i++)
        {
            n[i] = input.nextInt();
        }

        nextPermutaiton(n,length);    
        input.close();    
        
    }
    
}
