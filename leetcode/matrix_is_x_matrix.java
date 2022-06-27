public class matrix_is_x_matrix {

    //#Tags: 2D Array Matrix , 2d Matrix Traversal #2d matrix Diagonal  
    public boolean checkXMatrix(int[][] grid) 
    {
        int n = grid.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i == j || (i+j) == (n-1))
                {
                    if(grid[i][j] == 0)
                    {
                    return false;
                    }
                }
                else
                {
                    if(grid[i][j] !=0)
                    {
                        return false;
                    }
                }
                    
                }
            
                
            }
        return true;
        }


    public static void main(String[] args) {
        
    }
}
