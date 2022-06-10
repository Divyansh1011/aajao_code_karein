import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class meeting
{
    int start;
    int end;
    int pos;

    meeting(int s,int e,int pos)
    {
        this.start = s;
        this.end = e;
        this.pos = pos;
    }
}

class myComparator implements Comparator<meeting>
{

	@Override
	public int compare(meeting arg0, meeting arg1) {
		// TODO Auto-generated method stub
		if(arg0.end < arg1.end)
        {
            return -1;

        }

        if(arg0.end > arg1.end)
        {
            return 1;
        }

        return 0;
	}


}


public class max_meeting {


	 static void maxmeeting(ArrayList<meeting> ar, int size) 
    {
        ArrayList<Integer> a = new ArrayList<>();

        int time_limit = 0; 

        myComparator mc = new myComparator();

        Collections.sort(ar, mc);

        a.add(ar.get(0).pos);

        time_limit = ar.get(0).end;

        for (int index = 0; index < size; index++) 
        {
            if(ar.get(index).start > time_limit)
            {
                a.add(ar.get(index).pos);
                time_limit = ar.get(index).end;
                
            }
            
        }

        for (int index = 0; index < a.size(); index++)
        {
            System.out.println(a.get(index) + 1 + " ");
            
        }





	}
    public static void main(String[] args) 
    {

        int s[] = { 1, 3, 0, 5, 8, 5 };
     
        // Finish time
        int f[] = { 2, 4, 6, 7, 9, 9 }; 
    
        ArrayList<meeting> ar= new ArrayList<meeting>();

        for (int index = 0; index < s.length; index++) 
        {
            ar.add(new meeting(s[index], f[index], index));
            
        }

        maxmeeting(ar,ar.size());
        
        


        
    }

}
