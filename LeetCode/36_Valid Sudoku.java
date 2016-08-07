/**
*Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
A partially filled sudoku which is valid.
*
*/

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int a,b;
        int arr1[] = new int[10];
        int arr[] = new int[10];
        for(int i=0;i<board.length;i++){
            for (int k = 0;k<arr.length;k++){
                arr[k] = 0;
                arr1[k] = 0;
            }
            for(int j = 0 ;j<board.length;j++){
                if(board[i][j]!='.'){
                    a = Integer.parseInt(String.valueOf(board[i][j]));
                    arr[a] = arr[a] + 1;
                }
                if(board[j][i]!='.'){
                    b = Integer.parseInt(String.valueOf(board[j][i]));
                    arr1[b] = arr1[b] + 1;
                }
            }
            for (int k = 0;k<arr.length;k++){
                if (arr[k]>1){
                    return false;
                }
                if (arr1[k]>1){
                    return false;
                }
            }
        }
        return true;
    }
}
