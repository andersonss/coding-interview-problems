package p2_minimum_brackets_to_remove;

import java.util.Stack;

/**
 * https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
 */
public class MinimumBracketsToRemove {
    public String minRemoveToMakeValid(String s) { // Time: O(N) Space: O(N)
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else if (chars[i] == ')') {
                if (stack.isEmpty()) {
                    chars[i] = 0;
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.empty()) {
            chars[stack.pop()] = 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != 0) {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }

    public String minRemoveToMakeValidOpt(String s) { // Time: O(N) Space: O(1)
        int countOpen = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                countOpen++;
            } else if (chars[i] == ')') {
                if (countOpen == 0) {
                    chars[i] = 0;
                } else {
                    countOpen--;
                }
            }
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '(' && countOpen > 0) {
                chars[i] = 0;
                countOpen--;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != 0) {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
