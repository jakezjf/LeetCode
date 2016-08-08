/**
*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*
*/

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows<=1){
            return s;
        }
        StringBuilder[] stringBuilder = new StringBuilder[numRows];
        for (int i=0;i<stringBuilder.length;i++){
            stringBuilder[i] = new StringBuilder("");
        }
        int index=0;
        int incre=1;
        for(int j = 0;j<s.length();j++){
            stringBuilder[index].append(s.charAt(j));
            if (index==0){
                incre = 1;
            }
            if (index==numRows-1){
                incre = -1;
            }
            index+=incre;
        }
        String re="";
        for (int i = 0;i<stringBuilder.length;i++){
            re += stringBuilder[i];
        }
        return re.toString();
    }
}
