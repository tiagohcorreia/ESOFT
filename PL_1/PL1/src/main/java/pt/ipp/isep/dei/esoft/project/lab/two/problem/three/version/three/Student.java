package pt.ipp.isep.dei.esoft.project.lab.two.problem.three.version.three;

public class Student {

    // Attributes
    public int number;
    public String name;
    public int grade;

    // Constructor
    public Student() {
    }

    // Operations (Behaviour)
    public boolean isApproved() {
        return (this.grade >= 10);
    }
}
