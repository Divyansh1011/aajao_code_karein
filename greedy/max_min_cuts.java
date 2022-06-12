import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;





public class max_min_cuts {
    static int max_min_cut( int a[], int [] b, int n, int m) 
    {
        Integer v[] = new Integer[n];
        Integer h[] = new Integer[m];

        for (int i = 0; i < n; i++) 
        {
            v[i] = Integer.valueOf(a[i]); 
            
        }

        for (int i = 0; i < m; i++) 
        {
            h[i] = Integer.valueOf(b[i]);
            
        }
        Arrays.sort(v,Collections.reverseOrder());
        Arrays.sort(h,Collections.reverseOrder());

        int hz = 1;
        int vt = 1;
        int ans = 0;

        int i = 0;
        int j = 0;

        while(i<n && j<m)
        {
            if(v[i]>h[j])
            {
                ans+= v[i] * vt;
                hz++;
                i++;
            }
            else
            {
                ans+= h[j] * hz;
                vt++;
                j++;
            }
        }

        int total = 0;
        while(i<n)
        {
            total += v[i++];
        }
        ans += total * vt;

        total = 0;
        while (j < m)
        {
            total += h[j++];
        }
    ans += total * hz;
  

        return ans;
    }
    public static void main(String[] args) {
        int n;
        int m;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();               
        n--;
        m--;
        int a[] = new int[n];
        int b[] = new int[m];

        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0;i<m;i++)
        {
            b[i] = sc.nextInt();
        }

        System.out.println(max_min_cut(a,b,n,m));
        sc.close();

    }

   
}
