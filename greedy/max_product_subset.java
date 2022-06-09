import java.util.Scanner;

public class max_product_subset {

     static int max_product(int[] s, int n) 
     {

        if(n==1)
        {
            return s[0];
        }

        int max_neg = Integer.MIN_VALUE;
        int count_neg = 0;
        int count_zero = 0;
        int prod = 1;

        for(int i = 0;i<n;i++)
        {
            if(s[i] == 0)
            {
                count_zero++;
                continue;
            }
            if(s[i]<0)
            {
                count_neg++;
                max_neg = Math.max(max_neg, s[i]);
            }
            prod = prod * s[i];
       }
       if(count_zero == n)
       {
           return 0;
       }

       if(count_neg %2 ==0)
       {
           if(count_neg == 1 && count_zero > 0 && count_neg + count_zero ==0)
           {
               return 0;
           }

           prod = prod/max_neg;
       }
       return prod;


           

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int s[] = new int[n];

        for (int index = 0; index < n; index++) 
        {
            s[index] = sc.nextInt();            
        }

        int product = max_product(s,n);
        System.out.println(product  );
        

    }

  
}
