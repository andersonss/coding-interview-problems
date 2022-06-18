package concepts;

import java.util.Stack;

public class MatrixTraversalIterativeDFS {

    // Initialize direction vectors
    static int[] dRow = { 0, 1, 0, -1 };
    static int[] dCol = { -1, 0, 1, 0 };

    static class pair
    {
        public int first;
        public int second;

        public pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }

    static Boolean isValid(Boolean[][] vis, int row,
                           int col)
    {

        final int ROW = vis.length;
        final int COL = vis[0].length;

        // If cell is out of bounds
        if (row < 0 || col < 0 ||
                row >= ROW || col >= COL)
            return false;

        // If the cell is already visited
        if (vis[row][col])
            return false;

        // Otherwise, it can be visited
        return true;
    }

    // Function to perform DFS
    // Traversal on the matrix grid[]
    static void DFS(int row, int col, int[][] grid,
                    Boolean[][] vis)
    {

        // Initialize a stack of pairs and
        // push the starting cell into it
        Stack<pair> st = new Stack<>();
        st.push(new pair(row, col));

        // Iterate until the
        // stack is not empty
        while (!st.empty())
        {

            // Pop the top pair
            pair curr = st.pop();

            row = curr.first;
            col = curr.second;

            // Check if the current popped
            // cell is a valid cell or not
            if (!isValid(vis, row, col))
                continue;

            // Mark the current
            // cell as visited
            vis[row][col] = true;

            // Print the element at
            // the current top cell
            System.out.print(grid[row][col] + " ");

            // Push all the adjacent cells
            for(int i = 0; i < 4; i++)
            {
                int adjx = row + dRow[i];
                int adjy = col + dCol[i];
                st.push(new pair(adjx, adjy));
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int[][] grid = { { -1, 2, 3 },
                { 0, 9, 8 },
                { 1, 0, 1 } };

        final int ROW = grid.length;
        final int COL = grid[0].length;

        Boolean[][] vis = new Boolean[ROW][COL];
        for(int i = 0; i < ROW; i++)
        {
            for(int j = 0; j < COL; j++)
            {
                vis[i][j] = false;
            }
        }

        // Function call
        DFS(0, 0, grid, vis);
    }
}

