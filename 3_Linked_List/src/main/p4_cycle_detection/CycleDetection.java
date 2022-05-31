package p4_cycle_detection;

import util.LinkedList;

import java.util.HashMap;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
public class CycleDetection {
    public LinkedList.Node detectCycle(LinkedList.Node head) { // Time: O(N) Space: O(N)
        // Base case
        if (head == null) {
            return null;
        }
        LinkedList.Node current = head;
        HashMap<LinkedList.Node, Integer> seenNodes = new HashMap<>();
        while (current != null) {
            if (seenNodes.containsKey(current)) {
                return current;
            } else {
                seenNodes.put(current, current.val);
            }
            current = current.next;
        }
        return null;
    }

    public LinkedList.Node detectCycleOpt(LinkedList.Node head) { // Time: O(N) Space: O(1)
        // Base case
        if (head == null) {
            return null;
        }
        LinkedList.Node tortoise = head, hare = head;
        do {
            tortoise = tortoise.next;
            hare = hare.next;
            if (hare == null || hare.next == null) {
                return null;
            } else {
                hare = hare.next;
            }
        } while (tortoise != hare);
        LinkedList.Node p1 = head, p2 = tortoise;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
