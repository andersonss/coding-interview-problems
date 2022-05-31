package p1_valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ValidParenthesesTest {

    @Test
    void isValid() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertThat(validParentheses.isValid("]")).isFalse();
        assertThat(validParentheses.isValid("")).isTrue();
        assertThat(validParentheses.isValid("{([])}")).isTrue();
        assertThat(validParentheses.isValid("{([]")).isFalse();
        assertThat(validParentheses.isValid("{[(])}")).isFalse();
        assertThat(validParentheses.isValid("{[]()}")).isTrue();
    }
}