package p4_cycle_detection;

import org.junit.jupiter.api.Test;
import util.LinkedList;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CycleDetectionTest {

    @Test
    void detectCycle() {
        LinkedList.Node head = new LinkedList.Node(3);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(0);
        head.next.next.next = new LinkedList.Node(-4);
        head.next.next.next.next = head.next;
        assertThat(new CycleDetection().detectCycle(head)).isEqualTo(head.next);
    }

    @Test
    void detectCycleOpt() {
        LinkedList.Node head = new LinkedList.Node(3);
        head.next = new LinkedList.Node(2);
        head.next.next = new LinkedList.Node(0);
        head.next.next.next = new LinkedList.Node(-4);
        head.next.next.next.next = head.next;
        assertThat(new CycleDetection().detectCycleOpt(head)).isEqualTo(head.next);
    }
}