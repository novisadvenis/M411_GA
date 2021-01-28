import java.util.Date;

/**
 * Beschreibung:
 *
 * @version 1.0 21.01.2021
 * @author Viviana Kontos
 */

public class Quicksort implements SortInterface {

    private static double schleifen;
    private static double vergleiche;


    private static void sortParts(int[] arr, int leftPos, int rightPos) {
        if (leftPos < rightPos) {
            int middlePos = split(arr, leftPos, rightPos);
            sortParts(arr, leftPos, middlePos - 1);
            sortParts(arr, middlePos + 1, rightPos);
        }
    }

    private static int split(int[] arr, int leftPos, int rightPos) {

        int pivot = arr[rightPos];
        int i = (leftPos - 1);

        for (int j = leftPos; j < rightPos; j++) {
            vergleiche++;
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                schleifen++;
            }
            vergleiche++;
            schleifen++;
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[rightPos];
        arr[rightPos] = temp;

        return i + 1;
    }

    @Override
    public double[] sort(int[] arr, int length) {
        long start = new Date().getTime();
        sortParts(arr, 0, length - 1);
        double time = new Date().getTime()-start;
        return new double[]{schleifen, time, vergleiche};
    }
}
