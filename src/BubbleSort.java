/**
 * @author Viviana Kontos
 * @date 21.01.2021
 */

public class BubbleSort extends SortWerte {

    private String name = "Bubblesort";

    public BubbleSort() {
        super.setName(name);
    }

    @Override
    public void logic(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            incrementAnzahlVergleiche();
            for (int j = 0; j < length - i - 1; j++) {
                incrementAnzahlVergleiche();
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    incrementAnzahlSchleifen();
                }
                incrementAnzahlVergleiche();
                incrementAnzahlSchleifen();
            }
            incrementAnzahlSchleifen();
        }
    }
}
