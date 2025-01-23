package isp.lab6.exercise1;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class TestExercise1 {
    private static final double DELTA = 1e-15 ;
    StudentGradeManagementSystem stud;
    HashMap<String, Integer> grades;
    Student student;
    ArrayList<Student> studentList;

    @Test
    public void testAddStudent() {

        assertEquals(1, stud.studentList.size());

        String name = "Oana";
        String id = "2";
        this.grades = new HashMap<>();
        grades.put("Math", 8);
        grades.put("English", 9);
        this.student = new Student(name, id, grades);
        this.studentList = new ArrayList<>();
        stud.addStudent(name,id,grades);

        assertEquals(2, stud.studentList.size());

        assertEquals(name,student.getName());
    }

    @Test
    public void testRemovedTest(){
        String idToRemove = "1";
        stud.removeStudent(idToRemove);
        assertEquals(0,stud.studentList.size());
    }


    @Test
    public void testAverageGrade(){
        String targetId = "1";
        assertEquals(9.0 ,stud.calculateAverageGrade(targetId),DELTA);
    }
}

