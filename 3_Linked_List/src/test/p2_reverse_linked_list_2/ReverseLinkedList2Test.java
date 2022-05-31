package p2_reverse_linked_list_2;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import util.LinkedList;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ReverseLinkedList2Test {

    @Test
    public void reverseBetweenTest1() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        LinkedList.head = LinkedList.createList(arr);
        assertThat(LinkedList.printList(new ReverseLinkedList2().reverseBetween(LinkedList.head, 2, 4)))
                .isEqualTo("1 4 3 2 5");
    }

    @Test
    public void reverseBetweenTest2() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        LinkedList.head = LinkedList.createList(arr);
        assertThat(LinkedList.printList(new ReverseLinkedList2().reverseBetween(LinkedList.head, 1, 5)))
                .isEqualTo("5 4 3 2 1");
    }

    @Test
    public void reverseBetweenTest3() {
        LinkedList.head = new LinkedList.Node(5);
        AssertionsForClassTypes.assertThat(LinkedList.printList(new ReverseLinkedList2().reverseBetween(LinkedList.head, 1, 1)))
                .isEqualTo("5");
    }
}