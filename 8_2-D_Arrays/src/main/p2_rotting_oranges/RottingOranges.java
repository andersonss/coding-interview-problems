package p2_rotting_oranges;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/rotting-oranges/
 */
public class RottingOranges {

    static int[][] directions = {
            {-1, 0}, // up
            {0, 1}, // right
            {1, 0}, // down
            {0, -1} // left
    };

    final int ROTTEN = 2;
    final int FRESH = 1;
    final int EMPTY = 0;
    public int orangesRotting(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        final int n = grid.length;
        final int m = grid[0].length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (grid[row][col] == ROTTEN) {
                    queue.add(new int[] {row, col});
                }
                if (grid[row][col] == FRESH) {
                    freshOranges++;
                }
            }
        }
        int currentQueueSize = queue.size();
        int minutes = 0;
        while (!queue.isEmpty()) {
            if (currentQueueSize == 0) {
                minutes++;
                currentQueueSize = queue.size();
            }
            int[] currentOrange = queue.poll();
            currentQueueSize--;
            int row = currentOrange[0];
            int col = currentOrange[1];
            for (int i = 0; i < directions.length; i++) {
                int[] currentDir = directions[i];
                int nextRow = currentDir[0] + row;
                int nextCol = currentDir[1] + col;
                if(nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m) {
                    continue;
                }
                if (grid[nextRow][nextCol] == FRESH) {
                    grid[nextRow][nextCol] = 2;
                    freshOranges--;
                    queue.add(new int[] {nextRow, nextCol});
                }
            }
        }
        return freshOranges > 0 ? -1 : minutes;
    }
}
