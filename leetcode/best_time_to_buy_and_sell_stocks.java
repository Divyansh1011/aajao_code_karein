/**
 * best_time_to_buy_and_sell_stocks
 */

 //tags: Greedy, Arrays
public class best_time_to_buy_and_sell_stocks {
    public int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE;
        int maxpro = 0;
        
        for(int i = 0;i<prices.length;i++)
        {
            if(prices[i]<minPrice)
            {
                minPrice = prices[i];
            }
            
            else if(prices[i] - minPrice > maxpro)
            {
                maxpro = prices[i] - minPrice;                
            }
        }
        return maxpro;
    }
    public static void main(String[] args) {
        
    }
}