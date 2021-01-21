public class BubbleSort implements SortInterface {


    public double[] sort(int[] arr, int length) {
        long start = System.nanoTime();
        double[] messArr;
        double schleifen = 0;
        double vergleiche = 0;
        for (int i = 0; i < length; i++) {
            vergleiche++;
            for (int j = 0; j < length - i - 1; j++) {
                vergleiche++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    schleifen++;
                }
                vergleiche++;
                schleifen++;
            }
            schleifen++;
        }
        double time = (System.nanoTime() - start) / 1000000000;
        messArr = new double[]{schleifen, time, vergleiche};
        return messArr;
    }
}
