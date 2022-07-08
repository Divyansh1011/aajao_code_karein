import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class geekland_cossedium {

    static  long coloseeum(int N, int a[])
    {
        int n = 3*N;
        long premax[] = new long[n+1];
        Arrays.fill(premax, 0);
        long suffix[] = new long[n+1];
        Arrays.fill(suffix, 0);
        
        long sum = 0;

        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder()); 

        for(int i = 0;i< n;i++)
        {
            if(minheap.size() < n)
            {
                minheap.add(a[i]);
                sum+= a[i];
            }
            if(minheap.size() == n && a[i] > minheap.peek())
            {
                sum -= minheap.peek();
                minheap.poll();
                sum+=a[i];
                minheap.add(a[i]); 
            }
            premax[i] = sum;
        }
        sum = 0;

        for(int i = n-1;i>=0;i--)
        {
            if(maxheap.size() < n)
            {
                maxheap.add(a[i]);
                sum+= a[i];
            }
            if(maxheap.size() == n && a[i] > maxheap.peek())
            {
                sum -= maxheap.peek();
                maxheap.poll();
                sum+=a[i];
                maxheap.add(a[i]); 
            }
            suffix[i] = sum;
        }
        long ans = (long)-1e18;
        for(int i = 0;i<= 3*N;i++) 
        {
            int b = 3* N-i;
            ans = Math.max(ans, premax[i] - suffix[b]);
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}

//Tags: Heap Sliding technique 
/*
 * Traverse the array -> put the elements in the minimum Priority Queue 
 * Check if the element is larger then the element in the Priority Queue, if yes append it to the prefix max sum array and PQ and running sum
 * do thes same thing in reverse for the second N group for getting
 *   
 * 
 *  */