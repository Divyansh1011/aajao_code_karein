public class flood_fill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) 
    {
        if(image[sr][sc] == newcolor)
        {
            return image;
        }
       
        
        dfs(image,sr,sc,newcolor,image[sr][sc]);        
        return image;
    }
    public void dfs(int[][] image,int sr,int sc,int newcolor,int oldcolor)
    {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=oldcolor)
        {
            return;
        }
      
        image[sr][sc] = newcolor;
        
        dfs(image,sr+1,sc,newcolor,oldcolor);
        dfs(image,sr-1,sc,newcolor,oldcolor);
        dfs(image,sr,sc+1,newcolor,oldcolor);
         dfs(image,sr,sc-1,newcolor,oldcolor);
    }
    public static void main(String[] args) {
        
    }
}
