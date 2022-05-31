package p1_typed_out_strings;

import org.junit.jupiter.api.Test;
import p1_typed_out_strings.TypedOutStrings;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class TypedOutStringsTest {

    @Test
    void backspaceCompare() {
        assertThat(new TypedOutStrings().backspaceCompare1("ab#z", "az#z")).isEqualTo(true);
        assertThat(new TypedOutStrings().backspaceCompare1("abc#d", "acc#c")).isEqualTo(false);
        assertThat(new TypedOutStrings().backspaceCompare1("x#y#z#", "a#")).isEqualTo(true);
        assertThat(new TypedOutStrings().backspaceCompare1("a###b", "b")).isEqualTo(true);
        assertThat(new TypedOutStrings().backspaceCompare1("Ab#z", "ab#z")).isEqualTo(false);
        assertThat(new TypedOutStrings().backspaceCompare1("y#fo##f", "y#f#o##f")).isEqualTo(true);
    }

    @Test
    void backspaceCompare2() {
        assertThat(new TypedOutStrings().backspaceCompare2("ab#z", "az#z")).isEqualTo(true);
        assertThat(new TypedOutStrings().backspaceCompare2("abc#d", "acc#c")).isEqualTo(false);
        assertThat(new TypedOutStrings().backspaceCompare2("x#y#z#", "a#")).isEqualTo(true);
        assertThat(new TypedOutStrings().backspaceCompare2("a###b", "b")).isEqualTo(true);
        assertThat(new TypedOutStrings().backspaceCompare2("Ab#z", "ab#z")).isEqualTo(false);
        assertThat(new TypedOutStrings().backspaceCompare2("y#fo##f", "y#f#o##f")).isEqualTo(true);
    }

    @Test
    void backspaceCompareOpt() {
        assertThat(new TypedOutStrings().backspaceCompareOpt("ab#z", "az#z")).isEqualTo(true);
        assertThat(new TypedOutStrings().backspaceCompareOpt("abc#d", "acc#c")).isEqualTo(false);
        assertThat(new TypedOutStrings().backspaceCompareOpt("x#y#z#", "a#")).isEqualTo(true);
        assertThat(new TypedOutStrings().backspaceCompareOpt("a###b", "b")).isEqualTo(true);
        assertThat(new TypedOutStrings().backspaceCompareOpt("Ab#z", "ab#z")).isEqualTo(false);
        assertThat(new TypedOutStrings().backspaceCompareOpt("y#fo##f", "y#f#o##f")).isEqualTo(true);
    }
}