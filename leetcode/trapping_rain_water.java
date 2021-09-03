
import java.util.Scanner;

public class trapping_rain_water 
{
    public static int height(int a[]) 
    {
        int length = a.length;
        int l = 0;
        int r = length -1;
        int res = 0;
        int lmax = 0;
        int  rmax = 0;

        while(l<=r)
        {
            if(a[l]<= a[r])
            {
                if(a[l]>=lmax)
                {
                    lmax = a[l];
                }
                else
                {
                    res += lmax - a[l];
                }
                l++;
            }
            else
            {
                if(a[r]>=rmax)
                {
                    rmax = a[r];
                }
                else
                {
                    res += rmax -a[r];
                }
                r--;
            }
        }

        return res;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        size = input.nextInt();
        int arr[] = new int[size];

        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int result = height(arr);
        System.out.println(result);
        input.close();
    
    }

}  