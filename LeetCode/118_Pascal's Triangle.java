/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]



*/

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> bList = new ArrayList<List<Integer>>();
        if(numRows == 0){
            return bList;
        }
        List<Integer> num = new ArrayList<Integer>();
        num.add(1);
        bList.add(num);
        for(int i = 1;i<numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            int len = bList.get(i-1).size() + 1; 
            
            for(int j = 0;j<len;j++){
                if(j == 0 || j == len-1){
                    list.add(1);
                }else{
                    list.add(bList.get(i-1).get(j-1) + bList.get(i-1).get(j));
                }
            }
            bList.add(list);
        }
        return bList;
    }
}
