/**
Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

Example:

Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]

/

public class Solution {
    public int minMoves(int[] nums) {
        if(nums.length < 1){
            return 0;
        }
        int min = nums[0];
        for(Integer num : nums){
            min = Math.min(min,num);
        }
        int result = 0;
        for(Integer num : nums){
            result = result + (num - min);
        }
        return result;
    }
}
