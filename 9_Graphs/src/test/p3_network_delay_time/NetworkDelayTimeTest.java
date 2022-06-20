package p3_network_delay_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class NetworkDelayTimeTest {

    @Test
    void timeToPropagateSignal() {
        int[][] times1 = new int[][] {
                {1,2,9},
                {1,4,2},
                {2,5,1},
                {4,2,4},
                {4,5,6},
                {3,2,3},
                {5,3,7},
                {3,1,5}
        };

        int[][] times2 = new int[][] {
                {2,3,4}
        };

        assertThat(new NetworkDelayTime().timeToPropagateSignal(times1, 5, 1)).isEqualTo(14);
        assertThat(new NetworkDelayTime().timeToPropagateSignal(times2, 3, 2)).isEqualTo(-1);
    }
}