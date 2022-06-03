package p1_kth_largest_element_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class KthLargestElementInAnArrayTest {

    @Test
    void findKthLargestQuickSort() {
        KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();
        assertThat(kthLargestElementInAnArray.findKthLargestQuickSort(new int[] {5,3,1,6,4,2}, 2)).isEqualTo(5);
        assertThat(kthLargestElementInAnArray.findKthLargestQuickSort(new int[] {2,3,1,2,4,2}, 4)).isEqualTo(2);
        assertThat(kthLargestElementInAnArray.findKthLargestQuickSort(new int[] {3}, 1)).isEqualTo(3);
    }
    @Test
    void findKthLargestQuickSelect() {
        KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();
        assertThat(kthLargestElementInAnArray.findKthLargestQuickSelect(new int[] {5,3,1,6,4,2}, 2)).isEqualTo(5);
        assertThat(kthLargestElementInAnArray.findKthLargestQuickSelect(new int[] {2,3,1,2,4,2}, 4)).isEqualTo(2);
        assertThat(kthLargestElementInAnArray.findKthLargestQuickSelect(new int[] {3}, 1)).isEqualTo(3);
    }
}