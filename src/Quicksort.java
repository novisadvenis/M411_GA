/**
 * @author Viviana Kontos
 * @date 21.01.2021
 */

public class Quicksort extends SortWerte {

    private String name = "Quicksort";

    public Quicksort() {
        super.setName(name);
    }

    private void sortParts(int[] arr, int leftPos, int rightPos) {
        if (leftPos < rightPos) {
            int middlePos = split(arr, leftPos, rightPos);
            sortParts(arr, leftPos, middlePos - 1);
            sortParts(arr, middlePos + 1, rightPos);
        }
        incrementAnzahlVergleiche();
        incrementAnzahlSchleifen();
    }

    private int split(int[] arr, int leftPos, int rightPos) {

        int pivot = arr[rightPos];
        int i = (leftPos - 1);

        for (int j = leftPos; j < rightPos; j++) {
            incrementAnzahlVergleiche();
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                incrementAnzahlSchleifen();
            }
            incrementAnzahlVergleiche();
            incrementAnzahlSchleifen();
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[rightPos];
        arr[rightPos] = temp;

        return i + 1;
    }

    @Override
    public void logic(int[] arr, int length) {
        sortParts(arr, 0, length - 1);
    }
}
