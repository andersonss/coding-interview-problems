package p1_typed_out_strings;

import java.util.Stack;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 */
public class TypedOutStrings {

    public boolean backspaceCompare1(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for (int p = 0; p < s.length(); p++) {
            if (s.charAt(p) == '#' && !stackS.empty()) {
                stackS.pop();
            } else if (s.charAt(p) != '#'){
                stackS.push(s.charAt(p));
            }
        }
        for (int p = 0; p < t.length(); p++) {
            if (t.charAt(p) == '#' && !stackT.empty()) {
                stackT.pop();
            } else if (t.charAt(p) != '#'){
                stackT.push(t.charAt(p));
            }
        }
        if (stackS.size() != stackT.size()) {
            return false;
        }
        for (int i = 0; i < stackS.size(); i ++) {
            if (stackS.get(i) != stackT.get(i)) {
                return false;
            }
        }
//        while(!stackS.empty()) {
//            if (stackS.peek() == stackT.peek()) {
//                stackS.pop();
//                stackT.pop();
//            } else {
//                return false;
//            }
//        }
        return true;
    }

    public boolean backspaceCompare2(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    public String buildString(String s) {
        Stack<Character> answer = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c != '#') {
                answer.push(c);
            } else if (!answer.empty()) {
                answer.pop();
            }
        }
        return String.valueOf(answer);
    }

    public boolean backspaceCompareOpt(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
            while (i >= 0) { // Find position of next possible char in build(S)
                if (s.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }
            while (j >= 0) { // Find position of next possible char in build(T)
                if (t.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j))
                return false;
            // If expecting to compare char vs nothing
            if ((i >= 0) != (j >= 0))
                return false;
            i--; j--;
        }
        return true;
    }
}
