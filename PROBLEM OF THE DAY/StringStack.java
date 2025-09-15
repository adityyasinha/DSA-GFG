/*
 You are given two strings pat and tar consisting of lowercase English characters. You can construct a new string s by performing any one of the following operation for each character in pat:

Append the character pat[i] to the string s.
Delete the last character of s (if s is empty do nothing).
After performing operations on every character of pat exactly once, your goal is to determine if it is possible to make the string s equal to string tar.

 */

 class Solution {
    public boolean stringStack(String pat, String tar) {
        // code here
          int i = pat.length() - 1;
        int j = tar.length() - 1;
        int skip = 0;  

        while (i >= 0) {
            char c = pat.charAt(i);

            if (skip > 0) {
                
                skip--;
            } else if (j >= 0 && c == tar.charAt(j)) {
               
                j--;
            } else {
               
                skip++;
            }
            i--;
        }

        return j <0;
    }
}
