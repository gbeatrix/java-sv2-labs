package schoolrecords;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class StudentTest {

    public static final Subject MATH = new Subject("matematika");
    public static final Tutor TUTOR = new Tutor("Nagy Lilla", Arrays.asList(MATH, new Subject("történelem")));


    @Test
    void emptyNameShouldThrowException() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Student(""));
        assertEquals("Student name must not be empty!", ex.getMessage());
    }

    @Test
    void nullMarkInGradingShouldThrowException() throws NullPointerException {

        Exception ex = assertThrows(NullPointerException.class, () -> new Student("Kovács").grading(null));
        assertEquals("Mark must not be null!", ex.getMessage());
    }

    @Test
    void testGrading() {
        //Given
        Student student = new Student("Kovács");
        //When
        student.grading(new Mark(MarkType.A, MATH, TUTOR));
        //Then
        assertEquals("Kovács marks: matematika: excellent(5)", student.toString());
    }

    @Test
    void testCalculateAverage() {
        //Given
        Student student = new Student("Kovács");
        //When
        student.grading(new Mark(MarkType.A, MATH, TUTOR));
        student.grading(new Mark(MarkType.C, MATH, TUTOR));
        student.grading(new Mark(MarkType.D, MATH, TUTOR));
        //Then
        assertEquals(3.33, student.calculateAverage());
    }

    @Test
    void testCalculateAverageIfMarksEmpty() {
        //Given
        Student student = new Student("Kovács");
        //Then
        assertEquals(0.0, student.calculateAverage());
    }

    @Test
    void testCalculateSubjectAverage() {
        //Given
        Student student = new Student("Kovács");
        //When
        student.grading(new Mark(MarkType.A, MATH, TUTOR));
        student.grading(new Mark(MarkType.C, new Subject("történelem"), TUTOR));
        student.grading(new Mark(MarkType.D, MATH, TUTOR));
        //Then
        assertEquals(3.50, student.calculateSubjectAverage(MATH));
    }

    @Test
    void testCalculateSubjectAverageIfMarksEmpty() {
        //Given
        Student student = new Student("Kovács");
        //Then
        assertEquals(0.0, student.calculateSubjectAverage(MATH));
    }

    @Test
    void testCalculateSubjectAverageIfNoMarkFromSubject() {
        //Given
        Student student = new Student("Kovács");
        //When
        student.grading(new Mark(MarkType.A, MATH, TUTOR));
        student.grading(new Mark(MarkType.C, new Subject("történelem"), TUTOR));
        student.grading(new Mark(MarkType.D, MATH, TUTOR));
        //Then
        assertEquals(0.0, student.calculateSubjectAverage(new Subject("földrajz")));
    }
}
