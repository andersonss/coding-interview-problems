package p2_rotting_oranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class RottingOrangesTest {

    @Test
    void orangesRotting() {
        int[][] m1 = new int[][] {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };
        int[][] m2 = new int[][] {
                {2,1,1},
                {1,1,0},
                {1,0,1}
        };
        int[][] m3 = new int[][] {
                {0,2}
        };
        int[][] m4 = new int[][] {
                {2,0,0,0,0},
                {1,1,0,0,2},
                {0,1,1,1,1},
                {0,1,0,0,1}
        };
        assertThat(new RottingOranges().orangesRotting(m1)).isEqualTo(4);
        assertThat(new RottingOranges().orangesRotting(m2)).isEqualTo(-1);
        assertThat(new RottingOranges().orangesRotting(m3)).isEqualTo(0);
        assertThat(new RottingOranges().orangesRotting(m4)).isEqualTo(4);
    }
}