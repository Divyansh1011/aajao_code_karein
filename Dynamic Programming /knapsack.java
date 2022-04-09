
public class knapsack
{
    static int max(int a, int b) 
    {   
      return (a > b) ? a : b; 
    }

    public static int knapsack(int wt[],int value[], int weight, int n) 
    {
        if(n ==0 || weight ==0)
        {
            return 0;
        }
        if(wt[n-1]<= weight)
        {
            return max(value[n-1] + knapsack(wt, value, weight - wt[n-1], n-1), knapsack(wt, value, weight, n-1));     
        }
        else
        {
            return knapsack(wt, value, weight, n-1);
        }
        
    }

public static void main(String[] args) 
{
    int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(knapsack(wt,val,W,n));
 
}
}
