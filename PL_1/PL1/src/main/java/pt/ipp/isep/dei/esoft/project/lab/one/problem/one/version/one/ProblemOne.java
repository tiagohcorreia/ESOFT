package pt.ipp.isep.dei.esoft.project.lab.one.problem.one.version.one;

public class ProblemOne {

    /**
     * Sort an array of integers in ascending order. Implementation (1/2).
     *
     * @param array Array of integers.
     * @return Sorted array of integers.
     */
    public static int[] sortArrayAscending(int[] array) {

        if(array != null) {
            parceTheArrayAsManyTimesAsSize(array);
        }

        return array;
    }
    public static void parceTheArrayAsManyTimesAsSize(int[] arr) {

        int arrSize = arr.length;

        for (int i = 0; i < arrSize; i++) {

            moveHigherElementToTheLastIndexablePositionOfTheArray(arr, arrSize - i - 1);
        }
    }
    private static void moveHigherElementToTheLastIndexablePositionOfTheArray(int[] arr, int lastIndexablePosition) {

        for (int j = 0; j < lastIndexablePosition; j++) {

            if (firstIsHigherThanSecond(arr[j], arr[j + 1])) {

                swapArrayElements(arr, j, j + 1);
            }
        }
    }
    private static void swapArrayElements(int[] arr, int index1, int index2) {

        int temp;

        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private static boolean firstIsHigherThanSecond(int first, int second) {
        return first > second;
    }

}
