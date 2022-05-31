package p3_flatten_multilevel_doubly_linked_list;

import org.junit.jupiter.api.Test;
import util.LinkedList;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class FlattenMultilevelDoublyLinkedListTest {

    @Test
    public void flatten() {
        int[] arr1 = new int[]{10, 5, 12, 7, 11};
        int[] arr2 = new int[]{4, 20, 13};
        int[] arr3 = new int[]{17, 6};
        int[] arr4 = new int[]{9, 8};
        int[] arr5 = new int[]{19, 15};
        int[] arr6 = new int[]{2};
        int[] arr7 = new int[]{16};
        int[] arr8 = new int[]{3};

        /* create 8 linked lists */
        LinkedList.Node head1 = LinkedList.createDoublyList(arr1);
        LinkedList.Node head2 = LinkedList.createDoublyList(arr2);
        LinkedList.Node head3 = LinkedList.createDoublyList(arr3);
        LinkedList.Node head4 = LinkedList.createDoublyList(arr4);
        LinkedList.Node head5 = LinkedList.createDoublyList(arr5);
        LinkedList.Node head6 = LinkedList.createDoublyList(arr6);
        LinkedList.Node head7 = LinkedList.createDoublyList(arr7);
        LinkedList.Node head8 = LinkedList.createDoublyList(arr8);

        /* modify child pointers to create the list shown above */
        head1.child = head2;
        head1.next.next.next.child = head3;
        head3.child = head4;
        head4.child = head5;
        head2.next.child = head6;
        head2.next.next.child = head7;
        head7.child = head8;

        assertThat(LinkedList.printList(new FlattenMultilevelDoublyLinkedList().flatten(head1)))
                .isEqualTo("10 4 20 2 13 16 3 5 12 7 17 9 19 15 8 6 11");
    }
}