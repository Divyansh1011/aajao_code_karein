public class validate_bst {
    public boolean isValidBST(TreeNode root) 
    {
        return isValidBst(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    public boolean isValidBst(TreeNode root,long minval,long maxval)
    {
        if(root == null)
        {
            return true;
        }
        if(root.val >= maxval || root.val<= minval) return false;
        return isValidBst(root.left,minval,root.val) && isValidBst(root.right,root.val,maxval);
    }
    public static void main(String[] args) {
        
    }
}
