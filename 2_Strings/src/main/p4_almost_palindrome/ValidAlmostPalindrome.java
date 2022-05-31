package p4_almost_palindrome;

/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 */
public class ValidAlmostPalindrome {
    public boolean checkPalindrome(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return (checkPalindrome(s, start, end - 1)) || checkPalindrome(s, start + 1, end);
            }
            start++;
            end--;
        }
        return true;
    }
}
