public class sum_max_path {
    public static int sumOfLongRootToLeafPath(Node root)
    {
        int maxSum [] = new int[1];
        maxSum[0] = Integer.MIN_VALUE;
        longpath(root, maxSum);
        return maxSum[0];
        //code here
    }
    private static int longpath(Node root, int maxSum[])
    {
        if(root == null)
        {
            return 0;
        }
        
        int left = Math.max(0, longpath(root.left,maxSum));
        int right = Math.max(0,longpath(root.right,maxSum));
        maxSum[0] = Math.max(maxSum[0], left+ right + root.data);
        return root.data + Math.max(left,right);
    }
    public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        



        int res = sumOfLongRootToLeafPath(root);
        System.out.println(res);

        
    }
}
