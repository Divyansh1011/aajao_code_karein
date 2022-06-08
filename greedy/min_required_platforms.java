import java.util.Arrays;
import java.util.Scanner;

/**
 * min_required_platforms
 */
public class min_required_platforms {
    static int min_required(int n, int[] arr, int[] dep) 
    {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int pt_no = 1;
        int i = 1;
        int j = 0;


        while(i < n)
        {
            if(arr[i] <= dep[j])
            {
                pt_no++;
            }
            else
            {
                j++;
            }
            i++;
            
        }

                
        return pt_no;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr [] = new int[n];
        int dep[] = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) 
        {
            dep[i] = sc.nextInt();            
        }

       int result =  min_required(n,arr,dep);
        System.out.println(result);

        sc.close();
    }

    
}

/* Two pointer approach: Sorting the arrival and departure time with ascending order 
 * BY deault the first train will be in 1st platform 
 * Start traversing the arrival time array compare with the departure time 
 * check if the arrival time is less then the departure time 
 * increase the plt_no 
 * if its more then then increase the j pointer that points to the next departure time 
 * 
 */