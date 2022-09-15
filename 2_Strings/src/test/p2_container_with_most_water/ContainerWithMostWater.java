package p2_container_with_most_water;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {
    public int maxAreaNaive(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                final int height = Math.min(heights[i], heights[j]);
                final int width = j - i;
                final int currentArea = height * width;
                maxArea = Math.max(currentArea, maxArea);
            }
        }
        return maxArea;
    }

    public int maxAreaOpt(int[] heights) {
        int maxArea = 0;
        for (int i = 0, j = heights.length - 1; i < j; ) {
            final int height = Math.min(heights[i], heights[j]);
            final int width = j - i;
            final int currentArea = height * width;
            maxArea = Math.max(currentArea, maxArea);
            if (heights[i] <= heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
