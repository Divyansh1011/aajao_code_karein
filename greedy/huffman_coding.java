import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Huffman_code
{
    int data;
    char c;
    
    Huffman_code left;
    Huffman_code right;
}

class mycomparator implements Comparator<Huffman_code>
{


	public int compare(Huffman_code arg0, Huffman_code arg1) 
    {

		return arg0.data - arg1.data;
	}

}

public class huffman_coding {

public static void printcode(Huffman_code root, String s)
{
    if(root.left == null && root.right == null && Character.isLetter(root.c))
    {
        System.out.println(root.c + ":" + s);
        return ;

    }

    printcode(root.left, s + "0");
    printcode(root.right, s + "1");

}

    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        char c[] = new char[n];
        int fre[] = new int[n];

        for (int index = 0; index < n; index++) 
        {
            c[index] = sc.next().charAt(0);
        }

        for (int index = 0; index < n; index++) 
        {

            fre[index] = sc.nextInt();
        }

        PriorityQueue<Huffman_code> arr = new PriorityQueue<Huffman_code>(n,new mycomparator());

        for(int i = 0;i<n;i++)
        {
            Huffman_code hf = new Huffman_code();
            hf.c = c[i];
            hf.data = fre[i];

            hf.left = null;
            hf.right = null;

            arr.add(hf);

        }

        Huffman_code root = null;

        while(arr.size()>1)
        {
            Huffman_code x = arr.peek();
            arr.poll();
            Huffman_code y = arr.peek();
            arr.poll();

            Huffman_code f = new Huffman_code();
            f.data = x.data + y.data;
            f.c = '-';

            f.left = x;
            f.right = y;

            root = f;

            arr.add(f);

        }

        printcode(root, "");

        sc.close();
        


        
    }
    
}
