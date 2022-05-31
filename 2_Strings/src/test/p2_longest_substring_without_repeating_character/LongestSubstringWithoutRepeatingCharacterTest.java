package p2_longest_substring_without_repeating_character;

import org.junit.jupiter.api.Test;
import p2_longest_subtring_without_repeating_character.LongestSubstringWithoutRepeatingCharacter;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class LongestSubstringWithoutRepeatingCharacterTest {

    @Test
    public void lengthOfLongestSubstring() {
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstring("au")).isEqualTo(2);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstring("abccabb")).isEqualTo(3);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstring("ccccccc")).isEqualTo(1);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstring("")).isEqualTo(0);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstring("abcbda")).isEqualTo(4);
    }

    @Test
    public void lengthOfLongestSubstringOpt() {
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstringOpt("au")).isEqualTo(2);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstringOpt("abccabb")).isEqualTo(3);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstringOpt("ccccccc")).isEqualTo(1);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstringOpt("")).isEqualTo(0);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstringOpt("abcbda")).isEqualTo(4);
    }

    @Test
    public void lengthOfLongestSubstringLeetCode() {
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstringLeetcode("au")).isEqualTo(2);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstringLeetcode("abccabb")).isEqualTo(3);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstringLeetcode("ccccccc")).isEqualTo(1);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstringLeetcode("")).isEqualTo(0);
        assertThat(new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstringLeetcode("abcbda")).isEqualTo(4);
    }
}