import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class first_negative_from_Window 
{
    public long[] printfirstnegative(long a[],long k,long size)
    {
        List<Long> ans = new ArrayList<Long>();
        long an[] = new long[(int) size];
        Queue<Long> q = new LinkedList<>();

        int j = 0;
        int i = 0;
        while(j<size)
        {
            if(a[j] < 0)
            {
                q.offer(a[j]);
                
            }
            if(j-i+1<k)
            {
                j++;
                continue;
            }
           else if(j-i+1 == k)
            {
                if(!q.isEmpty())
                {
                    ans.add(q.peek());
                }
                else
                {
                    ans.add((long) 0);
                }
                if(a[i] <0)
                {
                    q.poll();
                    i++;
                }
            }
            j++;
        }

        for(int y = 0;i< ans.size();i++)
        {
            an[y] = ans.get(y);

        }

        

        return an;
    } 
    public static void main(String[] args) {
        
    }
}
