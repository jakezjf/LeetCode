/*
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16

*/
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int col = grid[0].length;
        int row = grid.length;
        for(int i = 0;i<row;i++ ){
            for(int j = 0;j<col;j++){
                int flag = grid[i][j];
                if (flag == 1) {
                    count += 4;
                    if (i > 0 && grid[i-1][j] == 1) count -= 2;
                    if (j > 0 && grid[i][j-1] == 1) count -= 2;
                }

            }
        }
        return count;
    }
}

