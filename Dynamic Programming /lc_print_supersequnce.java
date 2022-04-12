import java.util.Scanner;


public class lc_print_supersequnce {

    public static void main(String[] args) 
    {

        Scanner s = new Scanner(System.in);

        String x = s.nextLine();
        String y = s.nextLine();

        int l1 = x.length();
        int l2 = y.length();

        System.out.println(printshortestSuperSequence(x,y,l1,l2));
        s.close();

    }

    public static String printshortestSuperSequence(String x, String y, int l1, int l2) 
    {
        int dp [][] = new int[l1+1][l2+1];
        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <=l2; j++) 
            {
                if (i == 0)
                {
                    dp[i][j] = j;
                }
                else if (j == 0)
                {
                    dp[i][j] = i;
                }
                else if(x.charAt(i-1) == y.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else 
                {
                    dp[i][j] =  Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        String str = "";

        int i = l1;
        int j = l2;
        while (i > 0 && j>0)
        {
            if(x.charAt(i-1) == y.charAt(j-1))
            {
                str += (x.charAt(i-1));

                i--;
                j--;
            }
            else if(dp[i-1][j] > dp[i][j-1])
            {
                str+= (y.charAt(j-1));

                j--;
            }
            else 
            {
                str+= (x.charAt(i-1));

                i--;
            }            
        } 

        while(i>0)
        {
            str += (x.charAt(i-1));
            i--;
        }
        while (j>0) 
        {
            str += (y.charAt(j-1));
            j--;
            
        }

        str = reverse(str);


        return str;
    }

    public static String reverse(String str) 
    {
        char [] temparray = str.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;

        for (left = 0; left<right; left++,right--) 
        {
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }

        return String.valueOf(temparray);
    }
}
