package p1_number_of_islands;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    static int[][] directions = {
            {-1, 0}, // up
            {0, 1}, // right
            {1, 0}, // down
            {0, -1} // left
    };

    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int islandCount = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                printMatrix(grid);
                if (grid[row][col] == '1') {
                    islandCount++;
                    grid[row][col] = '0';
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[] {row, col});
                    while (!queue.isEmpty()) {
                        final int[] currentPos = queue.poll();
                        final int currentRow = currentPos[0];
                        final int currentCol = currentPos[1];
                        for (int i = 0; i < directions.length; i++) {
                            final int[] currentDir = directions[i];
                            final int nextRow = currentRow + currentDir[0];
                            final int nextCol = currentCol + currentDir[1];
                            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n) {
                                continue;
                            }
                            if (grid[nextRow][nextCol] == '1') {
                                queue.add(new int[] {nextRow, nextCol});
                                grid[nextRow][nextCol] = '0';
                            }
                        }
                    }
                }
            }
        }
        return islandCount;
    }

    public void printMatrix(char[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}