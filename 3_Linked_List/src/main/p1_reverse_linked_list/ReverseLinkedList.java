package p1_reverse_linked_list;

import util.LinkedList;

/*
https://leetcode.com/problems/reverse-linked-list/submissions/
 */
public class ReverseLinkedList {

    public LinkedList.Node reverseList(LinkedList.Node head) {
        LinkedList.Node current = head;
        LinkedList.Node previous = null;
        LinkedList.Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public LinkedList.Node reverseListRecursive(LinkedList.Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedList.Node rest = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
}


