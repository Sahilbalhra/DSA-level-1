// 695. Max Area of Island leetcode
// You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

// The area of an island is the number of cells with a value 1 in the island.

// Return the maximum area of an island in grid. If there is no island, return 0.
// Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
// Output: 6
// Explanation: The answer is not 11, because the island must be connected 4-directionally.

public class MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int maxArea=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    maxArea=Math.max(maxArea,getCurrentArea(i,j,grid));
                }
            }
        }
        return maxArea; 
    }
    
    public int getCurrentArea(int i,int j,int[][] grid){
        if(i<0 || j<0 ||i>=grid.length ||j>=grid[0].length||grid[i][j]<=0){
            return 0;
        }
        //phuch liye
        grid[i][j]=-1;
        //left call
        int left=getCurrentArea(i,j-1,grid);
        //right
         int right=getCurrentArea(i,j+1,grid);
        //up
         int up=getCurrentArea(i-1,j,grid);
        //down
        int down=getCurrentArea(i+1,j,grid);
        
        int total=1+left+right+up+down;
        return total;
        
    }
    
}
