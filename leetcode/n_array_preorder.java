import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left;
    Node right;
    ArrayList<Node> children;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node left, Node right,ArrayList<Node> childer) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.children = childer;
    }
}

public class n_array_preorder 
{
    public List<Integer> preorder(Node root) 
    {
        List<Integer> res = new ArrayList<>();
        
        preordertraversal(root,res);
        return res;
    }
    
    public void preordertraversal(Node root, List<Integer> res)
    {
        if(root!=null)
        {
            res.add(root.val);
        
        for(Node node : root.children)  
        {
            List<Integer> res = new ArrayList<>();
            
            preordertraversal(root,res);
            return res;
        }
        
        public void preordertraversal(Node root, List<Integer> res)
        {
            if(root!=null)
            {
                res.add(root.val);
            
            for(Node node : root.children)
            {
                if(node!= null)
                {
                     preordertraversal(node, res);
                    
                }
               
            }
        }
        {
            if(node!= null)
            {
                 preordertraversal(node, res);
                
            }
           
        }
    }
}
    public static void main(String[] args) {
        
    }
    
}

