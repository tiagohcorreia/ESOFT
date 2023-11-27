package pt.ipp.isep.dei.esoft.project.lab.two.problem.three.version.one;

public class ProblemThree {

    public static int[] sortIntArrayAscending(int[] array) {
        if (array != null) {

            int arraySize = array.length;
            //Sort the array in ascending order using two for loops
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        //swap elements if not in order
                        swapIntArrayElements(array, j, j + 1);
                    }
                }
            }
        }
        return array;
    }

    public static String[] sortStringArrayAscending(String[] array) {
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
        if (array != null) {

            int arraySize = array.length;

            for (int i = 0; i < arraySize; i++) {

                for (int j = 0; j < arraySize - i - 1; j++) {

                    if (array[j].compareTo(array[j + 1]) > 0) {
                        swapStringArrayElements(array, j, j + 1);
                    }
                }
            }
        }
        return array;
    }

    private static void swapStringArrayElements(String[] array, int index1, int index2) {
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
        String pos;
        pos = array[index1];
        array[index1] = array[index2];
        array[index2] = pos;
    }

    private static void swapIntArrayElements(int[] array, int indexOne, int indexTwo) {
        int temp;
        temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

}