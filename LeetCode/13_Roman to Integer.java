/**Given a roman numeral, convert it to an integer.
*Input is guaranteed to be within the range from 1 to 3999.
*Subscribe to see which companies asked this question
*/

public class Solution {
    public int romanToInt(String s) {
      int sum = 0;
        boolean index = false;
        if (s.indexOf("MMM")!=-1 && index==false){
            sum = 3000;
            index = true;
        }
        if (s.indexOf("MM")!=-1 && index==false){
            sum = 2000;
            index = true;
        }
        if ((s.indexOf("M")!=-1 && s.indexOf("CM")==-1 || (s.indexOf("M")!=-1  && s.indexOf("MCM")!=-1) )&& index==false){
            sum = 1000;
        }
        index = false;
        if (s.indexOf("CM")!=-1 && index==false){
            sum = sum + 900;
            index = true;
        }
        if (s.indexOf("DCCC")!=-1 && index==false){
            sum = sum + 800;
            index = true;
        }
        if (s.indexOf("DCC")!=-1 && index==false){
            sum = sum + 700;
            index = true;
        }
        if (s.indexOf("DC")!=-1 && index==false){
            sum = sum + 600;
            index = true;
        }
        if (s.indexOf("CD")!=-1 && index==false){
            sum = sum + 400;
            index = true;
        }
        if (s.indexOf("D")!=-1 && index==false){
            sum = sum + 500;
            index = true;
        }

        if (s.indexOf("CCC")!=-1 && index==false){
            sum = sum + 300;
            index = true;
        }
        if (s.indexOf("CC")!=-1 && index==false){
            sum = sum + 200;
            index = true;
        }
        if ((s.indexOf("C")!=-1 && s.indexOf("XC")==-1 || (s.indexOf("C")!=-1  && s.indexOf("CXC")!=-1) ) && index==false){
            sum = sum + 100;
            index = true;
        }
        index = false;
        if (s.indexOf("XC")!=-1 && index==false){
            sum = sum + 90;
            index = true;
        }
        if (s.indexOf("LXXX")!=-1 && index==false){
            sum = sum + 80;
            index = true;
        }
        if (s.indexOf("LXX")!=-1 && index==false){
            sum = sum + 70;
            index = true;
        }
        if (s.indexOf("LX")!=-1 && index==false){
            sum = sum + 60;
            index = true;
        }
        if (s.indexOf("XL")!=-1 && index==false){
            sum = sum + 40;
            index = true;
        }
        if (s.indexOf("L")!=-1 && index==false){
            sum = sum + 50;
            index = true;
        }
        if (s.indexOf("XXX")!=-1 && index==false){
            sum = sum + 30;
            index = true;
        }
        if (s.indexOf("XX")!=-1 && index==false){
            sum = sum + 20;
            index = true;
        }
        if ( ((s.indexOf("X")!=-1  && s.indexOf("IX")==-1) || (s.indexOf("X")!=-1  && s.indexOf("XIX")!=-1) )&& index==false){
            sum = sum + 10;
        }
        index = false;
        if (s.indexOf("IX")!=-1 && index==false){
            sum = sum + 9;
            index = true;
        }
        if (s.indexOf("VIII")!=-1 && index==false){
            sum = sum + 8;
            index = true;
        }
        if (s.indexOf("VII")!=-1 && index==false){
            sum = sum + 7;
            index = true;
        }
        if (s.indexOf("VI")!=-1 && index==false){
            sum = sum + 6;
            index = true;
        }
        if (s.indexOf("IV")!=-1 && index==false){
            sum = sum + 4;
            index = true;
        }
        if (s.indexOf("V")!=-1 && index==false){
            sum = sum + 5;
            index = true;
        }
        if (s.indexOf("III")!=-1 && index==false){
            sum = sum + 3;
            index = true;
        }
        if (s.indexOf("II")!=-1 && index==false){
            sum = sum + 2;
            index = true;
        }
        if (s.indexOf("I")!=-1 && index==false){
            sum = sum + 1;
        }
        return sum;
    }
}
