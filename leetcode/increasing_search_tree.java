import java.util.ArrayList;
import java.util.List;

public class increasing_search_tree {

    public TreeNode increasingBST(TreeNode root) 
    {
        List<Integer> vals = new ArrayList();
        inorder(root,vals);
        TreeNode ans = new TreeNode(0);
        TreeNode cur = ans;
        for(int v: vals)
        {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return ans.right;
    }
    
    public void inorder(TreeNode node, List<Integer> vals)
    {
        if(node == null)
        {
            return;
        }
        inorder(node.left,vals);
        vals.add(node.val);
        inorder(node.right,vals);
    }
    public static void main(String[] args) {
        
    }
}
//Time complexity: O(N)
//Space Compexity: 0(N)
