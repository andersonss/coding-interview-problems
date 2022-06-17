package p1_number_of_islands;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class NumberOfIslandsTest {

    @Test
    void numIslands() {
        char[][] island1 = new char[][] {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','1'},
                {'0','0','0','1','1'}
        };
        char[][] island2 = new char[][] {
                {'0','1','0','1','0'},
                {'1','0','1','0','0'},
                {'0','1','1','1','0'},
                {'1','0','1','0','1'}
        };
        char[][] island3 = new char[][]{
                {'1', '1', '1', '1', '1', '0', '1', '1', '1', '1'},
                {'1', '0', '1', '0', '1', '1', '1', '1', '1', '1'},
                {'0', '1', '1', '1', '0', '1', '1', '1', '1', '1'},
                {'1', '1', '0', '1', '1', '0', '0', '0', '0', '1'},
                {'1', '0', '1', '0', '1', '0', '0', '1', '0', '1'},
                {'1', '0', '0', '1', '1', '1', '0', '1', '0', '0'},
                {'0', '0', '1', '0', '0', '1', '1', '1', '1', '0'},
                {'1', '0', '1', '1', '1', '0', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1', '1', '1', '1', '0', '1'},
                {'1', '0', '1', '1', '1', '1', '1', '1', '1', '0'}
        };
        char[][] island4 = new char[][] {
                {'1','1','0','1','0'},
                {'1','1','1','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        char[][] island5 = new char[][] {
                {'1','0','1', '0'},
                {'1','1','1', '0'},
                {'0','1','0', '1'},
                {'0','1','1', '1'}
        };
        // TODO implement with DFS
        assertThat(new NumberOfIslands().numIslands(island1)).isEqualTo(2);
        assertThat(new NumberOfIslands().numIslands(island2)).isEqualTo(6);
        assertThat(new NumberOfIslands().numIslands(new char[][] {})).isEqualTo(0);
        assertThat(new NumberOfIslands().numIslands(island3)).isEqualTo(2);
        assertThat(new NumberOfIslands().numIslands(island4)).isEqualTo(1);
        assertThat(new NumberOfIslands().numIslands(island5)).isEqualTo(1);
    }
}