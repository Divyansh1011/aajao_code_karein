public class nums_island_dfs {
    public int numIslands(char[][] grid) 
    {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int row = 0;row<grid.length;row++)
        {
            for(int column = 0;column<grid[0].length;column ++)
            {
                    if(visited[row][column] == false && grid[row][column] == '1')
                    {
                        count++;
                        traverse(grid,visited,row,column);
                        
                    }
            }
        }
        return count;
        
    }
    public void traverse(char[][] grid, boolean visited[][],int row,int column )
    {
        if(row<0 || column <0 || row>= grid.length || column >= grid[0].length)
        {
            return ;
        }
        else if(visited[row][column] == true )
        {
            return;
        }
        else if(grid[row][column] == '0')
        {
            return; 
            
        }
        
        visited[row][column] = true;
        traverse(grid,visited,row+1,column);
        traverse(grid,visited,row-1,column);
        traverse(grid,visited,row,column + 1);
        traverse(grid,visited,row,column -1);
            
    }
    public static void main(String[] args) {
        
    }
}
