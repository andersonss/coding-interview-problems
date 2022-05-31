package p3_trapping_rain_water;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {
    public int trapWaterBF(int[] heights) {
        int totalWater = 0;
        for (int p = 0; p < heights.length; p++) { // Time: O(n^2), Space: O(1)
            int leftP = p, rightP = p, maxLeft = 0, maxRight = 0;
            while (leftP >= 0) {
                maxLeft = Math.max(maxLeft, heights[leftP]);
                leftP--;
            }
            while (rightP < heights.length) {
                maxRight = Math.max(maxRight, heights[rightP]);
                rightP++;
            }
            final int currentWater = Math.min(maxLeft, maxRight) - heights[p];
            if (currentWater > 0) {
                totalWater += currentWater;
            }
        }
        return totalWater;
    }

    public int trapWaterOpt(int[] heights) { // Time: O(n), Space: O(1)
        int totalWater = 0;
        int maxLeft = 0, maxRight = 0;
        for (int left = 0, right = heights.length - 1; left < right;) {
            if (heights[left] <= heights[right]) {
                if (heights[left] >= maxLeft) {
                    maxLeft = heights[left];
                } else {
                   totalWater += maxLeft - heights[left];
                }
                left++;
            } else {
                if (heights[right] >= maxRight) {
                    maxRight = heights[right];
                } else {
                    totalWater += maxRight - heights[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}
