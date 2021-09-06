import java.util.ArrayList;
import java.util.Scanner;

/**
 * mulltiple_array_list
 */
public class mulltiple_array_list {

    public static void main(String[] args) 
    {
        Scanner n = new Scanner(System.in);
        int size;
        size = n.nextInt();

        ArrayList<ArrayList<Integer>> List = new ArrayList<>(size);
        
        for (int i = 0; i < List.size(); i++) {
            List.add(new ArrayList<>()); //initizalir the array list with multiple array list 
        }

        for (int i = 0; i < List.size(); i++) {
            for (int j = 0; j < List.size(); j++) {
                List.get(i).add(n.nextInt());
                
            }
            
        }

        System.out.println(List);

        n.close();



        
    }

    
}