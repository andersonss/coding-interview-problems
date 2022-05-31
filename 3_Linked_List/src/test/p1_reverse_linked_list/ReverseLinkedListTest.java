package p1_reverse_linked_list;

import org.junit.jupiter.api.Test;
import util.LinkedList;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ReverseLinkedListTest {

    @Test
    void reverseList() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        LinkedList.head = LinkedList.createList(arr);
        assertThat(LinkedList.printList(new ReverseLinkedList().reverseList(LinkedList.head)))
                .isEqualTo("5 4 3 2 1");
    }

    @Test
    void reverseListRecursive() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        LinkedList.head = LinkedList.createList(arr);
        assertThat(LinkedList.printList(new ReverseLinkedList().reverseListRecursive(LinkedList.head)))
                .isEqualTo("5 4 3 2 1");
    }
}