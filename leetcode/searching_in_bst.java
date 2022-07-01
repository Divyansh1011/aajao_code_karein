 class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
public class searching_in_bst {

        public TreeNode searchBST(TreeNode root, int val) 
        {
            while(root!=null && root.val!=val)
            {
                root = val<root.val?root.left:root.right;
            }
            return root;
            
        }
    
    public static void main(String[] args) {
        
    }
}

