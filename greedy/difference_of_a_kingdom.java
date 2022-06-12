
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class difference_of_a_kingdom {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        a.add(0);
        b.add(0);

        for(int i = 0;i<n;i++)
        {
            int x;
            int y;
            x = sc.nextInt();
            a.add(x);
            y =sc.nextInt();
            b.add(y);
        }
        a.add(w+1);
        b.add(h+1);

        Collections.sort(a,Collections.reverseOrder());
      Collections.sort(b, Collections.reverseOrder());

      int mx = 0;
      int my = 0;

      for (int i = 0; i < a.size()-1; i++) 
      {
          //System.out.println(a.get(i));
          int f = a.get(i+1) - a.get(i);

          System.out.println(f);
          mx = Math.max(mx, a.get(i+1) - a.get(i) - 1);
     
          my = Math.max(my, b.get(i+1)-b.get(i) - 1);        
      }

      System.out.println(mx*my);
    }

}
