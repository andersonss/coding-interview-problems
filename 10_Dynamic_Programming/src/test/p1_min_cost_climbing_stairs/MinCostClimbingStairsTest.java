package p1_min_cost_climbing_stairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class MinCostClimbingStairsTest {

    @Test
    void minCostClibing() {
        assertThat(new MinCostClimbingStairs().minCostClibingOptBottomUp(new int[] {10,15,20})).isEqualTo(15);
        assertThat(new MinCostClimbingStairs().minCostClibingOptBottomUp(new int[] {1,100,1,1,1,100,1,1,100,1}))
                .isEqualTo(6);
    }
}