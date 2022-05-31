package p3_queues_with_stacks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class QueuesWithStacksTest {
    @Test
    public void queueWithStacks() {
        QueuesWithStacks queuesWithStacks = new QueuesWithStacks();
        queuesWithStacks.push(1);
        queuesWithStacks.push(2);
        assertThat(queuesWithStacks.peek()).isEqualTo(1);
        assertThat(queuesWithStacks.pop()).isEqualTo(1);
        assertThat(queuesWithStacks.empty()).isFalse();
    }
}