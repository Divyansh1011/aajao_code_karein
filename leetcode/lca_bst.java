public class lca_bst {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root == null)
        {
            return null;
        }
        int curr = root.val;
        
        if(q.val>curr && p.val>curr)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
       if(q.val<curr && p.val<curr)
        {
           return  lowestCommonAncestor(root.left,p,q);
        }
        return root;
        
    }   
    public static void main(String[] args) {
        
    }
}
