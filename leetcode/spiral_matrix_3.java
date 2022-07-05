public class spiral_matrix_3 {

    public int[][] spiralMatrixIII(int rows, int cols, int x, int y) 
    {
        int [][] ans = new int[rows*cols][2];
        int n=0;
    int dx=0;
    int dy=1;
    int temp=0;
    for(int j = 0;j<rows*cols;++n)
    {
        for(int i = 0;i<n/2+1;++i)
        {
            if(x>=0 && x<rows && y>=0 && y<cols)
            {
                ans[j++]=new int[]{x,y};
            }
            x=x+dx;
            y=y+dy;

        }
         
        temp=dx;
        dx=dy;
        dy= -temp;
        
    }
        return ans;
       
    }
    
    
    public static void main(String[] args) {
        
    }
}
