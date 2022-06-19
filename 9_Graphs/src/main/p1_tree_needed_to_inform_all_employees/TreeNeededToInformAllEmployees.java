package p1_tree_needed_to_inform_all_employees;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/time-needed-to-inform-all-employees/
 */
public class TreeNeededToInformAllEmployees {
    public int numOfMinutes(int n, int headId, int[] managers, int[] informTime) {
        Map<Integer, List<Integer>> adjList = new LinkedHashMap<>();
        adjList.put(headId, new ArrayList<>());
        for (int e = 0; e < n; e++) {
            final int manager = managers[e];
            if (manager == -1) {
                continue;
            }
            if(adjList.containsKey(manager)) {
                adjList.get(manager).add(e);
            } else {
                List<Integer> reportees = new ArrayList<>();
                reportees.add(e);
                adjList.put(managers[e], reportees);
            }
        }
        return dfs(headId, adjList, informTime);
    }

    private int dfs(int currentId, Map<Integer, List<Integer>> adjList, int[] informTime) {
        List<Integer> reportees = adjList.get(currentId);
        if(reportees == null || reportees.isEmpty()) {
            return 0;
        }
        int max = 0;
        List<Integer> subordinates = adjList.get(currentId);
        for (int i = 0; i < subordinates.size(); i++) {
            max = Math.max(max, dfs(subordinates.get(i), adjList, informTime));
        }
        return max + informTime[currentId];
    }
}
