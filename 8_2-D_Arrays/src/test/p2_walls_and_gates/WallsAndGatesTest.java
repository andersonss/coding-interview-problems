package p2_walls_and_gates;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
class WallsAndGatesTest {

    @Test
    void solution() {
        final int I = Integer.MAX_VALUE;
        final int W = -1;
        int G = 0;
        int[][] m1 = new int[][] {
                {I, W, G, I},
                {I, I, I, G},
                {I, W, I, W},
                {G, W, I, I}
        };

        int[][] s1 = new int[][] {
                {3, -1, 0, 1},
                {2, 2, 1, 0},
                {1, -1, 2, -1},
                {0, -1, 3, 4}
        };


        int[][] m2 = new int[][] {
                {I, W, G, I},
                {W, I, I, W},
                {I, W, I, W},
                {G, W, I, I}
        };

        int[][] s2 = new int[][] {
                {I, -1, 0, 1},
                {-1, 2, 1, -1},
                {1, -1, 2, -1},
                {0, -1, 3, 4}
        };

        assertThat(new WallsAndGates().shortPathGrid(m1)).isEqualTo(s1);
        assertThat(new WallsAndGates().shortPathGrid(m2)).isEqualTo(s2);
    }
}