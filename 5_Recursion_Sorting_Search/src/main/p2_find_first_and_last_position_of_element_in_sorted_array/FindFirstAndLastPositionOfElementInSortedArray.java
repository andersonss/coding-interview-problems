package p2_find_first_and_last_position_of_element_in_sorted_array;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1,-1};
        }
        int firstPosition = binarySearch(nums, 0, nums.length - 1, target);
        if (firstPosition == -1) {
            return new int[] {-1,-1};
        }
        int startPosition = firstPosition, endPosition = firstPosition, temp1 = 0, temp2 = 0;
        while (startPosition != -1) {
            temp1 = startPosition;
            startPosition = binarySearch(nums, 0, startPosition - 1, target);
        }
        startPosition = temp1;
        while (endPosition != -1) {
            temp2 = endPosition;
            endPosition = binarySearch(nums, endPosition + 1, nums.length - 1, target);
        }
        endPosition = temp2;
        return new int[] {startPosition, endPosition};
    }

   public int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    int binarySearchRecursive(int[] arr, int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearchRecursive(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearchRecursive(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
