package p3_flatten_multilevel_doubly_linked_list;

import util.LinkedList;

/**
 * https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
 */
public class FlattenMultilevelDoublyLinkedList {

    /*
    1. Start from the head, move one step each time to the next node
    2. When meet with a node with child, say node p, follow its child chain to the end and connect the tail node with
    p.next, by doing this we merged the child chain back to the main thread
    3. Return to p and proceed until find next node with child
    4. Repeat until reach null
     */
    public LinkedList.Node flatten(LinkedList.Node head) { // Time: O(N) Space: O(1)
        // Base case
        if(head == null) {
            return null;
        }
        // Pointer
        LinkedList.Node current = head;
        while (current != null) {
            // CASE 1: if no child, proceed
            if (current.child == null) {
                current = current.next;
                continue;
            }
            // CASE 2: got child, find tail of the child and link to p.next
            LinkedList.Node temp = current.child;
            while (temp.next != null) {
                temp = temp.next;
            }
            // Connect tail with p.next, if it is not null
            temp.next = current.next;
            if (current.next != null) {
                current.next.prev = temp;
            }
            // Connect p with p.child and remove p.child
            current.next = current.child;
            current.child.prev = current;
            current.child = null;
        }
        return head;
    }
}
