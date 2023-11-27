package pt.ipp.isep.dei.esoft.project.lab.two.problem.three.version.one;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.esoft.project.lab.two.problem.three.version.one.ProblemThree;

import static org.junit.jupiter.api.Assertions.*;

class ProblemThreeTest {

    @DisplayName("Ensure testing arrays individually fails")
    @Test
    //@Disabled
    public void ensureIndividuallyTestingArraysFails() {
        //Arrange
        int[] studentNumbers = {1200001, 1200032, 1190432, 1181208};
        String[] studentNames =
                {"Ana Maria Sousa", "André Pinto da Silva", "Martim Gomes Costa", "Mariana Gonçalves Mendes"};
        int[] studentGrades = {16, 12, 17, 14};

        int[] expectedStudentNumbers = {1181208, 1190432, 1200001, 1200032};
        String[] expectedStudentNames =
                {"Mariana Gonçalves Mendes", "Martim Gomes Costa", "Ana Maria Sousa", "André Pinto da Silva"};
        int[] expectedStudentGrades = {14, 17, 16, 12};

        // Act
        int[] studentNumbersResult = ProblemThree.sortIntArrayAscending(studentNumbers);
        String[] studentNamesResult = ProblemThree.sortStringArrayAscending(studentNames);
        int[] studentGradesResult = ProblemThree.sortIntArrayAscending(studentGrades);

        //Assert

        // check the input array is the same as output
        assertSame(studentNumbers, studentNumbersResult);
        assertSame(studentNames, studentNamesResult);
        assertSame(studentGrades, studentGradesResult);

        //check dimension
        assertEquals(expectedStudentNumbers.length, studentNumbersResult.length);
        assertEquals(expectedStudentNames.length, studentNamesResult.length);
        assertEquals(expectedStudentGrades.length, studentGradesResult.length);

        // check array content
        assertNotEquals(expectedStudentNumbers, studentNumbers);
        assertNotEquals(expectedStudentNames, studentNames);
        assertNotEquals(expectedStudentGrades, studentGrades);

    }
}