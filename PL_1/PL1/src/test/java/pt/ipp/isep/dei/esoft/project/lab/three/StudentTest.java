package pt.ipp.isep.dei.esoft.project.lab.three;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @DisplayName("Ensure to creat a valid student works")
    @Test
    public void createValidStudentWorks() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student = new Student(1234567, "Madara");
            assertNotNull(student);
        });
    }

    @DisplayName("Ensure creating a student with six digits negative number fails")
    @Test
    public void ensureCreateStudentWith6DigitsNegativeNumberFails() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student7 = new Student(-123456, "Kakashi");
            assertFalse(student7.isValidNumber(student7.getNumber()));
        });
    }

    @DisplayName("Ensure students’s number is 7 digits number works")
    @Test
    public void ensureStudentNumberIsASevenDigitNumberWorks() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student7 = new Student(1234567, "Yuto");
            assertTrue(student7.isValidNumber(student7.getNumber()));
        });
    }

    @DisplayName("Ensure creating a 7 digits negative nember fails")
    @Test
    public void ensureStudentNumberIsPositiveWorks() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student6 = new Student(-1234567, "Asuna");
            assertFalse(student6.isValidNumber(student6.getNumber()));
        });
    }
    @DisplayName("Ensure creating a longer number fails")
    @Test
    public void EnsureCreatingLongerNumberFails() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student6 = new Student(12345678, "Asuna");
            assertFalse(student6.isValidNumber(student6.getNumber()));
        });
    }

    @DisplayName("Ensure creating a student with no name fails")
    @Test
    public void ensureStudentWithNoNameFails() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student = new Student(1234567, "");
            assertFalse(student.isValidName(student.getName()));
        });
    }
    @DisplayName("Ensure creating a student with name full of spaces fails")
    @Test
    public void ensureStudentWithNameFullOfSppacesFails() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student = new Student(1234567, " ");
            assertFalse(student.isValidName(student.getName()));
        });
    }
    @DisplayName("Ensure creating a student with short name lenght fails")
    @Test
    public void ensureStudentWithShortNameFails() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student = new Student(1234567, "Yuma");
            assertFalse(student.isValidName(student.getName()));
        });
    }
    @DisplayName("Ensure creating a student with valid number and invalid name fails")
    @Test
    public void ensureStudentWithValidNumberAndInvalidNameFails() {

        assertThrows(IllegalArgumentException.class, () -> {
            Student student = new Student(1234567, "May");
            assertFalse(student.isValidName(student.getName()) && student.isValidNumber(student.getNumber()));
        });
    }
}








