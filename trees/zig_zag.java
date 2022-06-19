
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Queue;



public class zig_zag {
    public static ArrayList<ArrayList<Integer>> zigzag(Node root) 
    {
        
        Queue<Node> q = new LinkedList<Node>();
        boolean leftoright = true;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        q.offer(root);
        if(root == null)
        {
            return ans;
        }


        while(!q.isEmpty())
        {
            int size = q.size();
            ArrayList<Integer> sub = new ArrayList<Integer>(size);
            for(int i = 0;i<size;i++)
            {
                Node front = q.peek();
               


                if(front.left != null)
                {
                    q.offer(front.left);
                }
                if(front.right != null)
                {
                    q.offer(front.right);
                }

                if(leftoright == true)
                {
                    sub.add( q.poll().data);
                }
                else
                {
                    sub.add(0, q.poll().data);
                }

            }
            leftoright = !leftoright;
            ans.add(sub);
        }

        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<ArrayList<Integer>> ans = zigzag(root);
        int i, j;

        for (i = 0; i < ans.size(); i++) {
            for (j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
    }

}
}
