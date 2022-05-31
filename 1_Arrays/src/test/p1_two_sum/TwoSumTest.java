package p1_two_sum;

import org.junit.jupiter.api.Test;
import p1_two_sum.TwoSum;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TwoSumTest {

    @Test
    public void twoSumNaive() {
        assertThat(new TwoSum().twoSumNaive(new int[] {2, 7, 11, 15}, 9)).isEqualTo(new int[] {0, 1});
        assertThat(new TwoSum().twoSumNaive(new int[] {3, 2, 4}, 6)).isEqualTo(new int[] {1, 2});
        assertThat(new TwoSum().twoSumNaive(new int[] {3, 3}, 6)).isEqualTo(new int[] {0, 1});
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> assertThat(new TwoSum().twoSumNaive(new int[] {2, 7, 11, 15}, 29))
                        .isEqualTo(new int[] {0, 1})).withMessage("No match found!");
    }

    @Test
    public void twoSumOpt() {
        assertThat(new TwoSum().twoSumOpt(new int[] {2, 7, 11, 15}, 9)).isEqualTo(new int[] {0, 1});
        assertThat(new TwoSum().twoSumOpt(new int[] {3, 2, 4}, 6)).isEqualTo(new int[] {1, 2});
        assertThat(new TwoSum().twoSumOpt(new int[] {3, 3}, 6)).isEqualTo(new int[] {0, 1});
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> assertThat(new TwoSum().twoSumOpt(new int[] {2, 7, 11, 15}, 29))
                        .isEqualTo(new int[] {0, 1})).withMessage("No match found!");
    }

    @Test
    public void twoSumUdemy() {
        assertThat(new TwoSum().twoSumUdemy(new int[] {2, 7, 11, 15}, 9)).isEqualTo(new int[] {0, 1});
        assertThat(new TwoSum().twoSumUdemy(new int[] {3, 2, 4}, 6)).isEqualTo(new int[] {1, 2});
        assertThat(new TwoSum().twoSumUdemy(new int[] {3, 3}, 6)).isEqualTo(new int[] {0, 1});
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> assertThat(new TwoSum().twoSumUdemy(new int[] {2, 7, 11, 15}, 29))
                        .isEqualTo(new int[] {0, 1})).withMessage("No match found!");
    }
}
