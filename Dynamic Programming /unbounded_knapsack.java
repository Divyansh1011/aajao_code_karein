public class unbounded_knapsack 
{
    static int max(int a,int b)
    {
        return (a>b)?a:b;
    }
    public static int unknapsack(int wt[],int value[], int weight, int n)
    {
        if(n==0 || weight == 0)
        {
            return 0;

        }
        if(wt[n-1] <= weight)
        {
            return max(value[n-1] + unknapsack(wt,value , weight - wt[n-1], n), unknapsack(wt, value, weight, n-1));

        
        }
        else 
        {
            return unknapsack(wt, value, weight, n-1);
            
        }

    }
    
    public static void main(String[] args) 
    {
        int W = 100;
        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};
        int n = val.length;
        
        System.out.println(unknapsack(wt,val,W,n));
    }
    
}
