package p2_course_schedule;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CourseScheduleTest {

    @Test
    void canFinish() {
        assertThat(new CourseSchedule().canFinish(2, new int[][] {{1,0}})).isTrue();
        assertThat(new CourseSchedule().canFinish(2, new int[][] {{1,0},{0,1}})).isFalse();
    }
}