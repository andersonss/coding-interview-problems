package p1_tree_needed_to_inform_all_employees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class TreeNeededToInformAllEmployeesTest {

    @Test
    void numOfMinutes() {
        assertThat(new TreeNeededToInformAllEmployees().numOfMinutes(1,0,new int[] {-1}, new int[] {0}))
                .isEqualTo(0);
        assertThat(new TreeNeededToInformAllEmployees().numOfMinutes(6,2,new int[] {2,2,-1,2,2,2}, new int[] {0,0,1,0,0,0}))
                .isEqualTo(1);
    }
}