
package c.example.pacchi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    private App app;

    @BeforeEach
    public void setUp() {
        app = new App();
    }

    // Test total marks
    @Test
    public void testCalculateTotal() {
        int[] marks = {90, 80, 70, 60, 100};

        assertEquals(400, app.calculateTotal(marks));
    }

    // Test average marks
    @Test
    public void testCalculateAverage() {
        int[] marks = {90, 80, 70, 60, 100};

        assertEquals(80.0, app.calculateAverage(marks));
    }

    // Test A+ grade
    @Test
    public void testGradeAPlus() {
        assertEquals("A+", app.calculateGrade(95));
    }

    // Test A grade
    @Test
    public void testGradeA() {
        assertEquals("A", app.calculateGrade(85));
    }

    // Test B grade
    @Test
    public void testGradeB() {
        assertEquals("B", app.calculateGrade(75));
    }

    // Test C grade
    @Test
    public void testGradeC() {
        assertEquals("C", app.calculateGrade(65));
    }

    // Test D grade
    @Test
    public void testGradeD() {
        assertEquals("D", app.calculateGrade(55));
    }

    // Test F grade
    @Test
    public void testGradeF() {
        assertEquals("F", app.calculateGrade(40));
    }

    // Test invalid marks
    @Test
    public void testInvalidMarks() {
        int[] marks = {90, 80, 70, 60, 110};

        assertThrows(IllegalArgumentException.class,
                () -> app.calculateTotal(marks));
    }

    // Test invalid number of subjects
    @Test
    public void testInvalidSubjects() {
        int[] marks = {90, 80, 70};

        assertThrows(IllegalArgumentException.class,
                () -> app.calculateTotal(marks));
    }

    // Test invalid average
    @Test
    public void testInvalidAverage() {
        assertThrows(IllegalArgumentException.class,
                () -> app.calculateGrade(110));
    }
}
