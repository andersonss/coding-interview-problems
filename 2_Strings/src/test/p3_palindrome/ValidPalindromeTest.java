package p3_palindrome;

import org.junit.jupiter.api.Test;
import p3_palindrome.ValidPalindrome;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        assertThat(new ValidPalindrome().isPalindrome("abca")).isFalse();
        assertThat(new ValidPalindrome().isPalindrome("aabaa")).isTrue();
        assertThat(new ValidPalindrome().isPalindrome("aabbaa")).isTrue();
        assertThat(new ValidPalindrome().isPalindrome("abc")).isFalse();
        assertThat(new ValidPalindrome().isPalindrome("a")).isTrue();
        assertThat(new ValidPalindrome().isPalindrome("")).isTrue();
        assertThat(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }

    @Test
    void isPalindrome2() {
        assertThat(new ValidPalindrome().isPalindromeStartEnd("abca")).isFalse();
        assertThat(new ValidPalindrome().isPalindromeStartEnd("aabaa")).isTrue();
        assertThat(new ValidPalindrome().isPalindromeStartEnd("aabbaa")).isTrue();
        assertThat(new ValidPalindrome().isPalindromeStartEnd("abc")).isFalse();
        assertThat(new ValidPalindrome().isPalindromeStartEnd("a")).isTrue();
        assertThat(new ValidPalindrome().isPalindromeStartEnd("")).isTrue();
        assertThat(new ValidPalindrome().isPalindromeStartEnd("A man, a plan, a canal: Panama")).isTrue();
    }
}