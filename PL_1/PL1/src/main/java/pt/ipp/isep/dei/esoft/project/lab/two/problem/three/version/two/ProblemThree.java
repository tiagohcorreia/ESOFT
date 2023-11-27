package pt.ipp.isep.dei.esoft.project.lab.two.problem.three.version.two;

public class ProblemThree {
    public static boolean sortStudentsByAscendingNumber(int[] studentNumbers, String[] studentNames,
                                                        int[] studentGrades) {

        if((studentNumbers == null) || (studentNames == null) || (studentGrades == null)){
            return false;
        }
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        int arraySize = studentNumbers.length;

        for (int i = 0; i < arraySize; i++) {

            for (int j = 0; j < arraySize - i - 1; j++) {

                if(studentNumbers[j] > studentNumbers[j +1]) {

                    swapIntArrayElements(studentNumbers, j, j + 1);
                    swapStringArrayElements(studentNames, j, j + 1);
                    swapIntArrayElements(studentGrades, j, j + 1);
                }
            }
        }
        return true;
    }
    private static void swapStringArrayElements(String[] arr, int index1, int index2) {
        String pos;
        pos = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = pos;
    }
    private static void swapIntArrayElements(int[] arr, int index1, int index2) {
        int pos;
        pos = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = pos;
    }
}