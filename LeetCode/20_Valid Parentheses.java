/**
*
*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*
*/

public class Solution {
    public boolean isValid(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0;i<s.length();i++){
            int temp =0;
            if (s.charAt(i)=='('){
                stack.add(1);
            }else if (s.charAt(i)=='['){
                stack.add(2);
            }else if (s.charAt(i)=='{'){
                stack.add(3);
            }else{
                if (stack.empty()){
                    return false;
                }
                if (s.charAt(i)==')'){
                    temp = 4;
                }else if (s.charAt(i)==']'){
                    temp = 5;
                }else if (s.charAt(i)=='}'){
                    temp = 6;
                }
                if (stack.peek()!=(temp-3)){
                    return false;
                }else stack.pop();
                
            }
        }if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}
