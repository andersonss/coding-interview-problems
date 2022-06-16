package concepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MatrixTraversalRecursive {
    static int[][] directions = {
            {-1, 1}, // up
            {0, 1}, // right
            {1, 0}, // down
            {0, -1} // left
    };

    public static ArrayList<Integer> traversalDFS(int[][] matrix) {
        final int ROW = matrix.length;
        final int COL = matrix[0].length;
        boolean[][] seen = new boolean[ROW][COL];
        initializeSeen(seen);
        ArrayList<Integer> values = new ArrayList<>();
        dfs(matrix, 0, 0, seen, values);
        return values;
    }

    public static ArrayList<Integer> traversalBFS(int[][] matrix) {
        final int ROW = matrix.length;
        final int COL = matrix[0].length;
        boolean[][] seen = new boolean[ROW][COL];
        initializeSeen(seen);
        ArrayList<Integer> values = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        while (queue.size() != 0) {
            final int[] currentPos = queue.poll();
            final int row = currentPos[0];
            final int col = currentPos[1];
            if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || seen[row][col]) {
                continue;
            }
            seen[row][col] = true;
            values.add(matrix[row][col]);
            for (int i = 0; i < directions.length; i++) {
                final int[] currentDirection = directions[i];
                queue.add(new int[] {row + currentDirection[0], col + currentDirection[1]});
            }
        }
        return values;
    }

    private static void initializeSeen(boolean[][] seen) {
        for (int i = 0; i < seen.length; i++) {
            for (int j = 0; j < seen[0].length; j++) {
                seen[i][j] = false;
            }
        }
    }

    private static void dfs(int[][] matrix, int row, int col, boolean[][] seen, List<Integer> values) {
        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length || seen[row][col]) {
            return;
        }
        seen[row][col] = true;
        values.add(matrix[row][col]);

        for (int i = 0; i < directions.length; i++) {
            int[] currentDirection = new int[] {directions[i][0], directions[i][1]};
            dfs(matrix, row + currentDirection[0], col + currentDirection[1], seen, values);
        }
    }

    public static void main(String[] args) {
        int[][] testMatrix = new int[][] {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        System.out.println("Taversal 2-D matrix using DFS -> " + traversalDFS(testMatrix));
        System.out.println("Taversal 2-D matrix using BFS -> " + traversalBFS(testMatrix));
    }
}
