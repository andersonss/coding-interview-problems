package p4_almost_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ValidAlmostPalindromeTest {

    @Test
    public void validPalindrome() {
        assertThat(new ValidAlmostPalindrome().validPalindrome("aba")).isTrue();
        assertThat(new ValidAlmostPalindrome().validPalindrome("abccdba")).isTrue();
        assertThat(new ValidAlmostPalindrome().validPalindrome("abcdefaba")).isFalse();
        assertThat(new ValidAlmostPalindrome().validPalindrome("")).isTrue();
        assertThat(new ValidAlmostPalindrome().validPalindrome("a")).isTrue();
        assertThat(new ValidAlmostPalindrome().validPalindrome("ab")).isTrue();
    }
}