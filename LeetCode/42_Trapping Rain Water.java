/**
*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
*
*/
public class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int i = 0,temp = 0,index = 0;
        while (i<=height.length-1){
            temp = temp + height[i];
            System.out.println(temp);
            if (height[i]> height[index] && i!=index){

                temp = temp - (height[i] - height[index]);
                sum = sum + ((i-index+1)*height[index] - temp);
                System.out.println("  i=" + i + "  index=" +  index + "  sum=" + sum);
                index = i;
                temp = height[i];
            }
            i++;
        }
        index = height.length-1;
        i = height.length-1;
        temp = 0;
        int sum1 =0;
        while (i>=0){
            temp = temp + height[i];
//            System.out.println(temp);
            if (height[i]>= height[index] && i!=index){

                temp = temp - (height[i] - height[index]);
                sum1 = sum1 + ((index - i +1)*height[index] - temp);
//                System.out.println("  i=" + i + "  index=" +  index + "  sum1=" + sum1);
                index = i;
                temp = height[i];
            }
            i--;
        }
        return sum1 + sum;
    }
}
