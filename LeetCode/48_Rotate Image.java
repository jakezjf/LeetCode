/**
*You are given an n x n 2D matrix representing an image.
Rotate the image by 90 degrees (clockwise).
Follow up:
Could you do this in-place?
*
*/

public class Solution {
    public void rotate(int[][] matrix) {
        int arr[] = new int[matrix.length*matrix.length];
        int index = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = matrix.length-1;j>=0;j--){
                arr[index++] = matrix[j][i];
            }
        }
        index = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                matrix[i][j] = arr[index++];
            }
        }
    }
}
