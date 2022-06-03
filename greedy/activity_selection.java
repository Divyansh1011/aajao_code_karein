
import java.util.Scanner;

/**
 * min_cashflow
 */
public class activity_selection
{

     static void printActivities(int[] s, int[] f, int n) 
     {
         int i;
         int j;

         i =0;
         System.out.println(i + "");

         for (j=0;j<n;j++) 
         {

            if(s[j] >= f[i])
            {
                System.out.println(j+"");
                i = j;
            }
             
         }
        }
    public static void main(String[] args) 
    {
            int n ;
            Scanner sc = new Scanner(System.in);

            n = sc.nextInt();

            int s[] = new int[n];
            int f[] = new int[n];

            for (int i = 0; i < n; i++) 
            {
                s[i] = sc.nextInt();               
            }

            for (int i = 0; i < n; i++) 
            {
                f[i] = sc.nextInt();
            }

            printActivities(s,f,n);

            sc.close();



        

        
    }

    

    
}