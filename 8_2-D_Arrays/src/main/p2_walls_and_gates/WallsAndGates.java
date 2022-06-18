package p2_walls_and_gates;

/**
 * You are given a m x n 2D grid initialized with these three possible values.
 * -1 - A wall or an obstacle.
 * 0 - A gate.
 * INF - Infinity means an empty room. We use the value 2^31 - 1 = 2147483647 to represent INF as you may assume that
 * the distance to a gate is less than 2147483647.
 * Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled
 * with INF.
 *
 * https://leetcode.com/problems/walls-and-gates/
 */
public class WallsAndGates {

    static int[][] directions = {
            {-1, 0}, // up
            {0, 1}, // right
            {1, 0}, // down
            {0, -1} // left
    };
    final int INF = Integer.MAX_VALUE;
    final int WALL = -1;
    final int GATE = 0;
    public int[][] shortPathGrid(int[][] rooms) {
        final int n = rooms.length;
        final int m = rooms[0].length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (rooms[row][col] == GATE) {
                    dfs(rooms, row, col, 0);
                }
            }
        }
        return rooms;
    }

    private void dfs(int[][] rooms, int row, int col, int currentStep) {
        final int n = rooms.length;
        final int m = rooms[0].length;
        if (row < 0 || row >= n || col < 0 || col >= m || currentStep > rooms[row][col]) {
            return;
        }
        rooms[row][col] = currentStep;
        for (int i = 0; i < directions.length; i++) {
            final int[] currentDir = directions[i];
            dfs(rooms, row + currentDir[0], col + currentDir[1], currentStep + 1);
        }
    }
}
