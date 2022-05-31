package p2_reverse_linked_list_2;

import util.LinkedList;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/
 */
public class ReverseLinkedList2 {

    public LinkedList.Node reverseBetween(LinkedList.Node head, int left, int right) {
        int currentPos = 1;
        LinkedList.Node currentNode = head;
        LinkedList.Node start = head;
        while (currentPos < left) {
            start = currentNode;
            currentNode = currentNode.next;
            currentPos++;
        }
        LinkedList.Node newList = null;
        LinkedList.Node tail = currentNode;
        while (currentPos >= left && currentPos <= right) {
            LinkedList.Node next = currentNode.next;
            currentNode.next = newList;
            newList = currentNode;
            currentNode = next;
            currentPos++;
        }
        start.next = newList;
        tail.next = currentNode;
        if (left > 1) {
            return head;
        } else {
            return newList;
        }
    }
}
