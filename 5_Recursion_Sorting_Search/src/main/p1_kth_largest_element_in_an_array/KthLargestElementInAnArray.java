package p1_kth_largest_element_in_an_array;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestElementInAnArray {
    public int findKthLargestQuickSort(int[] nums, int k) {
        int indexToFind = nums.length - k;
        quickSort(nums, 0, nums.length - 1);
        return nums[indexToFind];
    }

    public int findKthLargestQuickSelect(int[] nums, int k) {
        int indexToFind = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, indexToFind);
    }

    private int quickSelect(int[] arr, int left, int right, int indexToFind) {
        int partitionIndex = getPartition2(arr, left, right);
        if (partitionIndex == indexToFind) {
            return arr[partitionIndex];
        } else if (indexToFind < partitionIndex) {
            return quickSelect(arr, left, partitionIndex - 1, indexToFind);
        } else {
            return quickSelect(arr, partitionIndex + 1, right, indexToFind);
        }
    }

    private void quickSort(int[] arr, int left, int right) {
        int partitionIndex = getPartition(arr, left, right);
        if (left < partitionIndex - 1) { // Sort left half
            quickSort(arr, left, partitionIndex - 1);
        }
        if (partitionIndex < right) { // Sort right half
            quickSort(arr, partitionIndex, right);
        }
    }

    private int getPartition2(int[] arr, int left, int right) {
        int i = left;
        for (int j = left; j <= right; j++) {
            if (arr[j] <= arr[right]) {
                swap(arr, i, j);
                i++;
            }
        }
        return i - 1;
    }

    private int getPartition(int[] arr, int left, int right) {
        int pivot = arr[(left + right)/2]; // Pick pivot
        while(left <= right) {
            // Find element on left that should be on right
            while (arr[left] < pivot) {
                left++;
            }
            // Find element on right that should be on left
            while (arr[right] > pivot) {
                right--;
            }
            // Swap elements, and move left and right indices
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
