import java.util.Arrays;

public class minimum_fill_cups {
    public int fillCups(int[] amount) 
    {
            int seconds = 0;
            Arrays.sort(amount);
        int highest = amount.length - 1;
        int secondhighest = amount.length - 2;
        
        while(amount[highest] > 0 && amount[secondhighest] > 0)
        {
            amount[highest] -- ;
            amount[secondhighest]--;
            seconds++;
            Arrays.sort(amount);
        }
        while(amount[highest] > 0)
        {
            amount[highest]--;
            seconds++;
        }
        return seconds;
}
    public static void main(String[] args) {
        
    }
}
