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
        
        for(Node node : root.children)  public List<Integer> preorder(Node root) 
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

