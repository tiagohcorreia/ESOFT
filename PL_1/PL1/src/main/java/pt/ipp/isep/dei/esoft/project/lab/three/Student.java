package pt.ipp.isep.dei.esoft.project.lab.three;

public class Student {

    // Attributes
    private int number;
    private String name;
    private int grade;
    private static final int MINIMO_CHARS_DE_NOME = 5;

    // Constructor
    public Student(int number, String name) {

        if (!this.isValidNumber(number)) {
            throw new IllegalArgumentException("Student number needs to be 7 digits number");
        }
        if (!this.isValidName(name)) {
            throw new IllegalArgumentException("Student name must have at least 5 chars");
        }
        this.number = number;
        this.name = name;
        this.grade = -1; //-1 means not evaluated
    }

    //---------------------------------------------------------------------------------

    //getters e setters

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    //------------------------------------------------------------------------------

    // Operations
    public boolean isValidNumber(int number) {

        if (number != Math.abs(number)) {
            return false;
        }
        String numberToString = Integer.toString(getNumber());
        return numberToString.length() == 7;
    }

    public boolean isValidName(String name) {

        if (name == null) {
            return false;
        }
        return name.length() >= MINIMO_CHARS_DE_NOME;
    }

    public boolean isValidGrade() {
        return this.grade >= 0 && this.grade <= 20;
    }

    private boolean isEvaluated() {
        return this.grade != -1;
    }

    public void doEvaluation(int grade) {
        if (!this.isEvaluated() && this.isValidGrade()) {
            this.grade = grade;
        }
    }

    public boolean isApproved() {
        return this.grade >= 10;
    }

    public int compareToByNumber(Student otherStudent) {

        if (this.number < otherStudent.number) {
            return -1; // lesser than other

        } else if (this.number > otherStudent.number) {
            return 1; // greater than other

        } else {
            return 0; // both have the same value
        }
    }

    public int compareToByGrade(Student otherStudent) {

        if (this.grade < otherStudent.grade) {
            return -1; // lesser than other

        } else if (this.grade > otherStudent.grade) {
            return 1; // greater than other

        } else {
            return 0; // both have the same value
        }
    }
}
