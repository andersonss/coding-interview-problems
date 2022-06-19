package p2_course_schedule;

import java.util.*;

/**
 * https://leetcode.com/problems/course-schedule/
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Topologic sort
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            final int[] pair = prerequisites[i];
            inDegree[pair[0]]++;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                stack.push(i);
            }
        }
        int count = 0;
        while (!stack.isEmpty()) {
            Integer current = stack.pop();
            count++;
            for (int i = 0; i < prerequisites.length; i++) {
                int[] pair = prerequisites[i];
                if (pair[1] == current) {
                    inDegree[pair[0]]--;
                    if (inDegree[pair[0]] == 0) {
                        stack.push(pair[0]);
                    }
                }
            }
        }
        return count == numCourses ;
    }
}
