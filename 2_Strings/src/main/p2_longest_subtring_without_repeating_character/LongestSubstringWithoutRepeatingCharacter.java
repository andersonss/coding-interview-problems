package p2_longest_subtring_without_repeating_character;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        boolean checkRepetition = false;
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int[] chars = new int[128];
                for (int k = i; k <= j; k++) {
                    char c = s.charAt(k);
                    chars[c]++;
                    if (chars[c] > 1) {
                        checkRepetition = true;
                    }
                }
                if (!checkRepetition) {
                    longest = Math.max(longest, j - i + 1);
                } else {
                    checkRepetition = false;
                }
            }
        }
        return longest;
    }

    public int lengthOfLongestSubstringOpt(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        Map<Character, Integer> seenChars = new HashMap<>();
        int left = 0, longest = 0;
        for (int right = 0; right < s.length(); right++) {
            Character currentChar = s.charAt(right);
            int prevSeenChar = -1;
            if (seenChars.containsKey(currentChar)) {
                prevSeenChar = seenChars.get(currentChar);
            }
            if (prevSeenChar >= left) {
                left = prevSeenChar + 1;
            }
            seenChars.put(currentChar, right);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }

    public int lengthOfLongestSubstringLeetcode(String s) {
        Integer[] chars = new Integer[128];
        int left = 0;
        int right = 0;
        int longest = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            Integer index = chars[r];
            if (index != null && index >= left && index < right) {
                left = index + 1;
            }
            longest = Math.max(longest, right - left + 1);
            chars[r] = right;
            right++;
        }
        return longest;
    }
}
