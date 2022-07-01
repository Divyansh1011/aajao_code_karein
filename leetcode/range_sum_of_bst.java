public class range_sum_of_bst {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
      
        if(root == null)
        {
            return 0;
        }
        if(root.val>=low)
        {
            rangeSumBST(root.left,low,high);
            
        }
        if(root.val<=high)
        {
            rangeSumBST(root.right,low,high);
            if(root.val>=low && root.val<=high)
            {
                sum+= root.val;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
