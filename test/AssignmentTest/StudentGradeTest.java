package AssignmentTest;

import Assignments.ArraysOfStudentsGrades;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class StudentGradeTest {
    @Test
    public void numberOfStudentTest(){
        ArraysOfStudentsGrades.StudentGrade student = new ArraysOfStudentsGrades.StudentGrade();
        student.setNumberOfStudent(4);
        assertEquals(4, student.getNumberOfStudent());
    }
    @Test
    public void numberOfSubjectTest(){
        ArraysOfStudentsGrades.StudentGrade student = new ArraysOfStudentsGrades.StudentGrade();
        student.setNumberOfStudent(4);
        student.setNumberOfSubject(3);
        assertEquals(4, student.getNumberOfStudent());
        assertEquals(3, student.getNumberOfSubject());
    }
    @Test
    public  void eachStudentNameTest(){
        ArraysOfStudentsGrades.StudentGrade student = new ArraysOfStudentsGrades.StudentGrade();
        student.setNumberOfStudent(2);
        student.setNumberOfSubject(3);
        int[][] school = new int[student.getNumberOfStudent()][student.getNumberOfSubject()];
        student.setStudentName("ademola", "shola");
        assertEquals(2, student.getNumberOfStudent());
        assertEquals(3, student.getNumberOfSubject());
        assertEquals(2, school.length);
        assertEquals(3, school[student.numberOfSubject].length);

    }
}
