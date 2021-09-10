import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        ArrayList<Integer> b = new ArrayList<Integer>();

        for(int i = 0;i<b.size();i++)
        {
            b.add(n.nextInt());
        }
        n.close();
    }
}

