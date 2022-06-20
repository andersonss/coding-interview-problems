package p3_network_delay_time;

import java.util.*;

/**
 * https://leetcode.com/problems/network-delay-time/
 */
public class NetworkDelayTime {

    public int timeToPropagateSignal(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for(int[] time : times){
            graph.putIfAbsent(time[0], new ArrayList<>());
            graph.get(time[0]).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        minHeap.add(new int[]{k, 0});
        boolean[] seen = new boolean[n+1];
        int nodes = 0;

        while(!minHeap.isEmpty()){
            int[] currItem = minHeap.poll();
            int currNode = currItem[0];
            if(seen[currNode])
                continue;
            seen[currNode] = true;

            nodes++;
            int time = currItem[1];

            if(nodes == n)
                return time;

            if(!graph.containsKey(currNode))
                continue;
            for(int[] node : graph.get(currNode)){
                minHeap.add(new int[]{node[0], node[1] + time});
            }
        }

        return -1;
    }
}
