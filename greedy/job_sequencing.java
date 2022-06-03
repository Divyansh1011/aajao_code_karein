import java.util.ArrayList;
import java.util.Collections;

/**
 * Job
 */
class Job 
{

    int id;
    int profit;
    int deadline;

    Job(int x,int y,int z)
    {
        this.id = x;
        this.profit = y;
        this.deadline = z;
    }

}


public class job_sequencing {

    int [] job_sequence(Job [] arr, int n)
    {

        ArrayList<Job> jobs = new ArrayList<Job>();

        for (Job e : arr) 
        {
            jobs.add(e);
            
        }
       

        Collections.sort(jobs, (a,b)-> b.profit - a.profit);

        boolean done[] = new boolean[n];

        int day = 0;
        int profit = 0;

        for (int index = 0; index < n; index++) {
            for (int j = (Math.min(n, jobs.get(index).deadline - 1)); j>=0; j++) 
            {

                if(done[j] == false)
                {
                    day+=1;
                    profit+= jobs.get(index).profit;

                    done[j] = true;
                    break;
                }
            }        
        }

        int result[] = new int[2];
        result[0] = day;
        result[1] = profit;
        return result;
    }
    public static void main(String[] args) 
    {

         
    }
}
