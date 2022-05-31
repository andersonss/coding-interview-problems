package p1_valid_parentheses;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public boolean isValid(String s) { // Time: O(N) Space: O(N)
        // Base case
        if (s.length() == 0) {
            return true;
        } else if (s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (!stack.empty()) {
                if ((stack.peek() == '{' && s.charAt(i) == '}')
                        || (stack.peek() == '[' && s.charAt(i) == ']')
                        || (stack.peek() == '(' && s.charAt(i) == ')')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
