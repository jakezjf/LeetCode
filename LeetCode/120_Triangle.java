/*
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

Note:
Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.

14ms
*/

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==1){
            return triangle.get(0).get(0);
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> dp = new ArrayList<>();
        dp.add(triangle.get(0));
        for(int i = 1;i<triangle.size();i++){
            temp = dp.get(i-1);
            list = triangle.get(i);
            List<Integer> now = new ArrayList<>();
            for(int j = 0;j<list.size();j++){
                if(j == 0){
                    now.add(temp.get(j) + list.get(j));
                    continue;
                }
                if(j == list.size()-1){
                    now.add(temp.get(j-1) + list.get(j));
                    continue;
                }
                int a = temp.get(j-1) + list.get(j);
                int b = temp.get(j) + list.get(j);
                now.add(a>b?b:a);
            }
            dp.add(now);
        }
        int flag = dp.get(dp.size()-1).get(0);
        for(int i = 0;i<dp.get(dp.size()-1).size();i++){
            if(dp.get(dp.size()-1).get(i) < flag){
                flag = dp.get(dp.size()-1).get(i);
            }
        }
        return flag;
    }
}
