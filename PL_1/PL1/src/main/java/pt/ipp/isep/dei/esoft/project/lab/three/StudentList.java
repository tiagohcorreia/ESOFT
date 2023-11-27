package pt.ipp.isep.dei.esoft.project.lab.three;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentList {
    // Attributes
    private ArrayList<Student> students;

    // Constructors
    public StudentList() {

        if (students == null) {
            throw new IllegalArgumentException("Student arrayList should not be null");
        }
        this.students = new ArrayList<>();
        for (Student st : students) {
            this.add(st);
        }

    }

    public StudentList(Student[] students) {
        if (students == null)
            throw new IllegalArgumentException("Students arraylist should not be null");

        this.students = new ArrayList();

        for (Student st : students) {
            this.add(st);
        }
    }
    //getters and setters

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    //-----------------------------------------------------------------------------------------------------

    // Operations
    public void sortByAscendingNumber() {
        this.students.sort((new SortByAscendingNumberComparator()));
    }

    public void sortByDescendingGrade() {
        this.students.sort(new SortByDescendingGradeComparator());
    }

    public Student[] toArray() {
        Student[] arr = new Student[this.students.size()];
        return this.students.toArray(arr);
    }

    public boolean add(Student student) {
        if (student == null) {
            return false;
        }
        if (this.students.contains(student)) {
            return false;
        }
        return this.students.add(student);
    }

    public boolean remove(Student student) {
        if (student == null) {
            return false;
        }
        if (!this.students.contains(student)) {
            return false;
        }
        return this.students.remove(student);
    }

    private class SortByAscendingNumberComparator implements Comparator<Student> {
        public int compare(Student st1, Student st2) {
            return st1.compareToByNumber(st2);
        }
    }

    private class SortByDescendingGradeComparator implements Comparator<Student> {
        public int compare(Student st1, Student st2) {
            return st1.compareToByGrade(st2) * (-1);
        }
    }
}

