package pt.ipp.isep.dei.esoft.project.lab.three;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.esoft.project.lab.two.problem.three.version.three.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest extends Student {

    @DisplayName("Ensure creating a studentlist works")
    @Test
    public void ensureCreateStudentListWorks() {
        // Act
        StudentList stList = new StudentList(); // StudentList empty
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] result = stList.toArray();

        //Assert
        //assertEquals(0, result.length); // check array
    }

    @DisplayName("Ensure creating a studentlist with some elements works")
    @Test
    public void ensureCreateStudentListWithSomeElementsWorks() {
        // Arrange
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentOne = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200001,"Ana Maria Sousa");
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentTwo = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200032,"André Pinto da Silva");
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentThree = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1190432,"Martim Gomes Costa");

        pt.ipp.isep.dei.esoft.project.lab.three.Student[] students = {studentOne,studentTwo,studentThree}; // Some order
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] expected = {studentOne,studentTwo,studentThree}; // A copy of students

        // Act
        StudentList stList = new StudentList(students);
        students[2] = studentOne; // change the original array
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] result = stList.toArray();

        //Assert
        //assertArrayEquals(expected,result); // check students are the same
        //assertNotSame(students, result);
    }

    @DisplayName("Ensure sorting an unsorted array by grade works")
    @Test
    public void ensureSortingUnsortedArraysByGradeWorks() {
        // Arrange
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentOne = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200001,"Ana Maria Sousa");
        studentOne.doEvaluation(16);
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentTwo = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200032,"André Pinto da Silva");
        studentOne.doEvaluation(12);
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentThree = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1190432,"Martim Gomes Costa");
        studentThree.doEvaluation(17);

        pt.ipp.isep.dei.esoft.project.lab.three.Student[] students = {studentOne,studentTwo,studentThree}; // Unordered
        StudentList stList = new StudentList(students);
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] expected = {studentThree,studentOne,studentTwo}; // Ordered

        // Act
        stList.sortByDescendingGrade();
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] result = stList.toArray();

        //Assert
        //assertArrayEquals(expected,result); // check students are sorted
    }

    @DisplayName("Ensure add a different student when array not empty works")
    @Test
    public void ensureAddDifferentStudentWhenArrayNotEmptyWorks(){
        // Arrange
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentOne = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200054, "Moreira");
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentTwo = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200145, "Sampaio");
        StudentList stList = new StudentList();
        stList.add(studentOne);

        // Act
        boolean result = stList.add(studentTwo);
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] content = stList.toArray();

        //Assert
        //assertTrue(result);
        //assertEquals(2,content.length);
    }

    @DisplayName("Ensure add the same student twice fails")
    @Test
    public void ensureAddSameStudentTwiceFails(){
        // Arrange
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentOne = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200054, "Moreira");
        StudentList stList = new StudentList();
        stList.add(studentOne);

        // Act
        boolean result = stList.add(studentOne);
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] content = stList.toArray();

        //Assert
        //assertFalse(result);
        //assertEquals(1,content.length);
    }

    @DisplayName("Ensure add a student with the same number fails")
    @Test
    public void ensureAddStudentWithSameNumberFails(){
        // Arrange
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentOne = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200054, "Moreira");
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentTwo = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200054, "Sampaio");
        StudentList stList = new StudentList();
        stList.add(studentOne);

        // Act
        boolean result = stList.add(studentTwo);
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] content = stList.toArray();

        //Assert
        //assertFalse(result);
        //assertEquals(1,content.length);
    }

    @DisplayName("ensure add null fails")
    @Test
    public void ensureAddNullFails(){
        // Arrange
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentOne = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200054, "Moreira");
        StudentList stList = new StudentList();
        stList.add(studentOne);

        // Act
        boolean result = stList.add(null);
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] content = stList.toArray();

        //Assert
        //assertFalse(result);
        //assertEquals(1,content.length);
    }

    @DisplayName("Ensure remove the middle student in several works")
    @Test
    public void ensureRemoveMiddleStudentInSeveralWorks(){
        // Arrange
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentOne = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200054, "Moreira");
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentTwo = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200154, "Sampaio");
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentThree = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1201154, "Costa");
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentFour = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1201354, "Lidia");
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentFive = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1101354, "Maria");

        pt.ipp.isep.dei.esoft.project.lab.three.Student[] all = {studentOne,studentTwo,studentThree,studentFour,studentFive};
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] expected = {studentOne,studentTwo,studentThree,studentFive};
        StudentList stList = new StudentList(all);

        // Act
        boolean result = stList.remove(studentFour);
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] content = stList.toArray();

        //Assert
        //assertTrue(result);
        //assertArrayEquals(expected,content);
    }

    @DisplayName("Ensure remove the same student twice returns false")
    @Test
    public void ensureRemoveSameStudentTwiceReturnsFalse(){
        // Arrange
        pt.ipp.isep.dei.esoft.project.lab.three.Student studentOne = new pt.ipp.isep.dei.esoft.project.lab.three.Student(1200054, "Moreira");
        StudentList stList = new StudentList();
        stList.add(studentOne);

        // Act
        boolean resultOne = stList.remove(studentOne);
        boolean resultTwo = stList.remove(studentOne);
        pt.ipp.isep.dei.esoft.project.lab.three.Student[] content = stList.toArray();

        //Assert
        //assertTrue(resultOne);
        //assertFalse(resultTwo);
        //assertEquals(0,content.length);
    }
}