package p2_minimum_brackets_to_remove;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class MinimumBracketsToRemoveTest {

    @Test
    void minRemoveToMakeValid() {
        MinimumBracketsToRemove minimumBracketsToRemove = new MinimumBracketsToRemove();
        assertThat(minimumBracketsToRemove.minRemoveToMakeValid("a)bc(d)")).isEqualTo("abc(d)");
        assertThat(minimumBracketsToRemove.minRemoveToMakeValid("(ab(c)d")).satisfiesAnyOf(
                s -> assertThat(s).isEqualTo("ab(c)d"),
                s -> assertThat(s).isEqualTo("(abc)d"));
        assertThat(minimumBracketsToRemove.minRemoveToMakeValid("))((")).isEqualTo("");
    }

    @Test
    void minRemoveToMakeValidOpt() {
        MinimumBracketsToRemove minimumBracketsToRemove = new MinimumBracketsToRemove();
        assertThat(minimumBracketsToRemove.minRemoveToMakeValidOpt("a)bc(d)")).isEqualTo("abc(d)");
        assertThat(minimumBracketsToRemove.minRemoveToMakeValidOpt("(ab(c)d")).satisfiesAnyOf(
                s -> assertThat(s).isEqualTo("ab(c)d"),
                s -> assertThat(s).isEqualTo("(abc)d"));
        assertThat(minimumBracketsToRemove.minRemoveToMakeValidOpt("))((")).isEqualTo("");
    }
}