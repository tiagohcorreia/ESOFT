package pt.ipp.isep.dei.esoft.project.lab.two.problem.three.version.three;

public class ProblemThree {
    public static boolean sortStudentsByAscendingNumber(Student[] students) {
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method

        if(students == null) {
            return false;
        }
        int arrSize = students.length;

        for (int i = 0; i < arrSize; i++) {

            for (int j = 0; j < arrSize - i - 1; j++) {

                if(students[j].number > students[j + 1].number) {

                    swapStudentArrayElements(students, j, j +1);
                }
            }
        }
        return true;
    }
    public static boolean sortStudentsByDescendingGrade(Student[] students) {
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method

        if(students == null) {
            return false;
        }

        int arrSize = students.length;

        for (int i = 0; i < arrSize; i++) {

            for (int j = 0; j < arrSize - i - 1; j++) {

                if(students[j].grade < students[j + 1].grade) {
                    swapStudentArrayElements(students, j, j + 1);
                }
            }
        }
        return true;
    }
    private static void swapStudentArrayElements(Student[] array, int indexOne, int indexTwo) {
        Student temp;
        temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

}