/**
*Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
*
*The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
*
*You may assume that each input would have exactly one solution.
*
*Input: numbers={2, 7, 11, 15}, target=9
*Output: index1=1, index2=2
*/

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int arr[] = new int[2];
        int j = numbers.length - 1;
        while(i < j){
            if((numbers[i] + numbers[j]) > target){
                j--;
            }
            if((numbers[i] + numbers[j]) < target){
                i++;
            }
            if((numbers[i] + numbers[j]) == target){
                arr[0] = i + 1;
                arr[1] = j + 1;
                return arr;
            }
        }
        arr[0] = 0;
        arr[1] = 0 ;
        return arr;
    }
}
