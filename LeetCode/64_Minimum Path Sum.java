/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

*/
public class Solution {
    public int minPathSum(int[][] grid) {
        int arr[][] = new int[grid.length][grid[0].length];
        arr[0][0] = grid[0][0];
        for(int i = 1;i<grid.length;i++){
            arr[i][0] = grid[i][0] + arr[i-1][0];
            // System.out.println(grid[i][0] + "  " + grid[i-1][0] + " " + arr[i][0]);
        }
        for(int j = 1;j<grid[0].length;j++){
            arr[0][j] = grid[0][j] + arr[0][j-1];
//            System.out.println(grid[0][j] + "  " + grid[0][j-1] + " " + arr[0][j]);
        }
        for(int i = 1;i<grid.length;i++){
            for(int j = 1;j<grid[0].length;j++){
                if(arr[i-1][j] >= arr[i][j-1]){

                    arr[i][j] = grid[i][j] + arr[i][j-1];
//                    System.out.println(grid[i][j] + "  " + grid[i][j-1]);
                }else{
                    arr[i][j] = grid[i][j] + arr[i-1][j];
//                    System.out.println(grid[i][j] + "  " + grid[i][j-1]);
                }
            }
        }
        return arr[grid.length-1][grid[0].length-1];
    }

}

