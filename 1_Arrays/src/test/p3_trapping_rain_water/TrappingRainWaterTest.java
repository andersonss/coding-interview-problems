package p3_trapping_rain_water;

import org.junit.jupiter.api.Test;
import p3_trapping_rain_water.TrappingRainWater;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TrappingRainWaterTest {

    @Test
    public void maxAreaBFTest() {
        assertThat(new TrappingRainWater().trapWaterBF(new int[] {4,2,0,3,2,5})).isEqualTo(9);
        assertThat(new TrappingRainWater().trapWaterBF(new int[] {3,4,3})).isEqualTo(0);
        assertThat(new TrappingRainWater().trapWaterBF(new int[] {0,1,0,2,1,0,1,3,2,1,2,1})).isEqualTo(6);
    }

    @Test
    public void maxAreaOptTest() {
        assertThat(new TrappingRainWater().trapWaterOpt(new int[] {4,2,0,3,2,5})).isEqualTo(9);
        assertThat(new TrappingRainWater().trapWaterOpt(new int[] {3,4,3})).isEqualTo(0);
        assertThat(new TrappingRainWater().trapWaterOpt(new int[] {0,1,0,2,1,0,1,3,2,1,2,1})).isEqualTo(6);
    }
}
