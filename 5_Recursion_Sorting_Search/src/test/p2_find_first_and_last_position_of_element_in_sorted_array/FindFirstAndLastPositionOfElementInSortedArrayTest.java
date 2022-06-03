package p2_find_first_and_last_position_of_element_in_sorted_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    void searchRange() {
        FindFirstAndLastPositionOfElementInSortedArray search = new FindFirstAndLastPositionOfElementInSortedArray();
        assertThat(search.searchRange(new int[] {5,7,7,8,8,10}, 8)).isEqualTo(new int[] {3,4});
        assertThat(search.searchRange(new int[] {5,7,7,8,8,10}, 6)).isEqualTo(new int[] {-1,-1});
        assertThat(search.searchRange(new int[] {}, 0)).isEqualTo(new int[] {-1,-1});
        assertThat(search.searchRange(new int[] {1}, 1)).isEqualTo(new int[] {0,0});
        assertThat(search.searchRange(new int[] {2,2}, 2)).isEqualTo(new int[] {0,1});

    }
}