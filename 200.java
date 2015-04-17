//Number of Islands 2.200
public class Solution {
    public int numIslands(char[][] grid) {
        int total=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    total++;
                    traverse(i,j,grid);
                }
            }
        }
        
        return total;
    }
    //DFS
    public void traverse(int i,int j, char[][] grid){
        grid[i][j]='0';
        if(i>=1 && grid[i-1][j]=='1') traverse(i-1,j,grid);
        if(i<grid.length-1 && grid[i+1][j]=='1') traverse(i+1,j,grid);
        if(j>=1 && grid[i][j-1]=='1') traverse(i,j-1,grid);
        if(j<grid[0].length-1 && grid[i][j+1]=='1') traverse(i,j+1,grid);
    }
}