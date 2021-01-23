public class Quicksort implements SortInterface {

    private static double schleifen;
    private static double vergleiche;

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 8, 9, 6, 1, 3};
    }

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
        long start = System.nanoTime();
        sortParts(arr, 0, length - 1);
        double time = (System.nanoTime() - start) / 1000000000;
        return new double[]{schleifen, time, vergleiche};
    }
}
