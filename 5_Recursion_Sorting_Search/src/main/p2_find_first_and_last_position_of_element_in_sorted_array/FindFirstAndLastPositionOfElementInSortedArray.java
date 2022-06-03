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
}
