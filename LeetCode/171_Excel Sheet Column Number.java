
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
public int titleToNumber(String s) {
        if (s == null)
            return 0;
        int result = 0;
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = (int)s.charAt(i) - 64; 
            result += c * (int)Math.pow(26, j);
            j++;
        }
        return result;
    }
