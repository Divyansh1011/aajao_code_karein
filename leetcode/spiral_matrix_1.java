import java.util.ArrayList;
import java.util.List;

public class spiral_matrix_1 {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> res = new ArrayList<Integer>();
        int startcol = 0;
        int endcol = matrix[0].length -1 ;
        int startrow = 0;
        int endrow = matrix.length-1;
        
           int len = (matrix[0].length * matrix.length);
        
        
        while(res.size()<len)
        {
            for(int i = startcol ; i<=endcol;i++)
            {
                res.add(matrix[startrow][i]);
            }
            for(int i = startrow+1;i<=endrow;i++)
            {
                res.add(matrix[i][endcol]);
            }
            for(int i = endcol -1 ;i>=startcol && res.size() < len;i--)
            {
                res.add(matrix[endrow][i]);
            }
            for(int i = endrow-1 ;i>startrow && res.size() < len;i--)
            {
                res.add(matrix[i][startcol]);
            }
             
            startcol++;
            startrow++;
            endrow--;
            endcol--;
        }
        return res;
        
    }
    public static void main(String[] args) {
        
    }
}
