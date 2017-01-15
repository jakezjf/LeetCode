/**
There is a list of sorted integers from 1 to n. Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.

Repeat the previous step again, but this time from right to left, remove the right most number and every other number from the remaining numbers.

We keep repeating the steps again, alternating left to right and right to left, until a single number remains.

Find the last number that remains starting with a list of length n.
*/

public class Solution {
    public int lastRemaining(int n) {
        boolean flag = true;
        int temp = n;
        int step = 1;
        int index = 1;
        while(temp>1){
            if(flag == true || temp%2==1){
                index = index + step;
            }
            temp = temp/2;
            step = step*2;
            flag = !flag;
        }
        return index;
    }
}

// 1 1       1
// 2 1 2      2
// 1
// 3 1 2 3    2
// 1
// 4 1 2 3 4   2
// 1
// 2
// 5  2        2 
// 6    4      4
// 7    4
// 8      6
// 9    
//   4    8  7
// 1 2 3 4 5 6 7 8 9 10 
// 1 4


//   6          
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
// 18 8
//      8          
