package p2_container_with_most_water;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ContainerWithMostWaterTest {

    @Test
    public void maxAreaTest() {
        assertThat(new ContainerWithMostWater().maxAreaNaive(new int[] {4,8,1,2,3,9})).isEqualTo(32);
        assertThat(new ContainerWithMostWater().maxAreaNaive(new int[] {1,0,0,0,0,0,0,2,2})).isEqualTo(8);
        assertThat(new ContainerWithMostWater().maxAreaNaive(new int[] {1,0,0,0,0,0,0,2,2})).isEqualTo(8);
        assertThat(new ContainerWithMostWater().maxAreaNaive(new int[] {1,8,6,2,5,4,8,3,7})).isEqualTo(49);
        assertThat(new ContainerWithMostWater().maxAreaNaive(new int[] {1,1})).isEqualTo(1);
    }

    @Test
    public void maxAreaOpt() {
        assertThat(new ContainerWithMostWater().maxAreaOpt(new int[] {4,8,1,2,3,9})).isEqualTo(32);
        assertThat(new ContainerWithMostWater().maxAreaOpt(new int[] {1,0,0,0,0,0,0,2,2})).isEqualTo(8);
        assertThat(new ContainerWithMostWater().maxAreaOpt(new int[] {1,0,0,0,0,0,0,2,2})).isEqualTo(8);
        assertThat(new ContainerWithMostWater().maxAreaOpt(new int[] {1,8,6,2,5,4,8,3,7})).isEqualTo(49);
        assertThat(new ContainerWithMostWater().maxAreaOpt(new int[] {1,1})).isEqualTo(1);
    }
}
