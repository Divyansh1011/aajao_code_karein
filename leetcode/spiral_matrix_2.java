public class spiral_matrix_2 {

    public int[][] generateMatrix(int n) 
    {
        int res[][]= new int[n][n];
        
        int top = 0;
        int bottom = res.length-1;
        int left = 0;
        int right = res.length-1;
        
        int value = 1;
        
        while(top<=bottom)
        {
            for(int i = left;i<=right;i++)
            {
                res[top][i] = value++;
            }
            top++;
            for(int i = top;i<=bottom;i++)
            {
                res[i][right] = value++;
            }
            right--;
            for(int i = right;i>=left;i--)
            {
                res[bottom][i] = value++;
            }
            bottom--;
            for(int i = bottom;i>=top;i--)
            {
                res[i][left] = value++;
            }
            left++;
        }
        return res;
        
    }
    public static void main(String[] args) {
        
    }
    
}
