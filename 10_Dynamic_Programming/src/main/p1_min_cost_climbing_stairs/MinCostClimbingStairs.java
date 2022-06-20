package p1_min_cost_climbing_stairs;

/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 */
public class MinCostClimbingStairs {

    public int minCostClibingOptBottomUp(int[] cost) {
        final int n = cost.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return cost[0];
        }
        int dpOne = cost[0];
        int dpTwo = cost[1];
        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(dpOne, dpTwo);
            dpOne = dpTwo;
            dpTwo = current;
        }
        return Math.min(dpOne, dpTwo);
    }

    public int minCostClimbingStairsTopDown(int[] cost) {
        final int n = cost.length;
        int[] dp = new int[n];
        return Math.min(minCost(n-1, cost, dp), minCost(n-2, cost, dp));
    }

    private int minCost(int i, int[] cost, int[] dp) {
        if (i < 0) {
            return 0;
        }
        if (i == 0 || i == 1) {
            return cost[i];
        }
        if (dp[i] != 0) {
            return dp[i];
        }
        dp[i] = cost[i] + Math.min(minCost(i-1, cost, dp), minCost(i-2, cost, dp));
        return dp[i];
    }

    public int minCostClibingNaive(int[] cost) {
        final int n = cost.length;
        return Math.min(minCost(n-1, cost), minCost(n-2, cost));
    }

    private int minCost(int i, int[] cost) {
        if (i < 0) {
            return 0;
        }
        if (i == 0 || i == 1) {
            return cost[i];
        }
        return cost[i] + Math.min(minCost(i-1, cost), minCost(i-2, cost));
    }
}
