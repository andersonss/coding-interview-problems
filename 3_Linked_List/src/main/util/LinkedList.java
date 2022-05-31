package util;

public class LinkedList {

    public static Node head;

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node createList(int[] arr) {
        Node node = null;
        Node p = null;
        int i;
        for (i = 0; i < arr.length; ++i) {
            if (node == null) {
                node = p = new Node(arr[i]);
            } else {
                p.next = new Node(arr[i]);
                p = p.next;
            }
            p.next = p.child = null;
        }
        return node;
    }

    public static Node createDoublyList(int[] arr) {
        Node node = null;
        Node p = null;
        int i;
        for (i = 0; i < arr.length; ++i) {
            if (node == null) {
                node = p = new Node(arr[i]);
            } else {
                p.next = new Node(arr[i]);
                p.next.prev = p;
                p = p.next;
            }
            p.next = p.child = null;
        }
        return node;
    }

    public static String printList(Node node) {
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.val);
            node = node.next;
            if (node != null) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}