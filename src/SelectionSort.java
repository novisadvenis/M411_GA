

/**
 * Beschreibung
 * Einfach und instabil
 * Sortieren durch direktes auswählen
 * best/worst case = O(n^2)
 * Anzahl Vergleiche = n(n-1)/2
 *
 * @author Kaushall Vimalarajah
 * @version 1.0 vom 21.01.2021
 */

public class SelectionSort extends SortWerte {

    private String name = "SelectionSort";

    public SelectionSort() {
        super.setName(name);
    }

    @Override
    public void logic(int[] arr, int length) {

        int i, j, minValue, minIndex, temp = 0;
        for (i = 0; i < length; i++) {
            incrementAnzahlVergleiche();
            minValue = arr[i];
            minIndex = i;
            for (j = i; j < length; j++) {
                incrementAnzahleSchliefe();
                if (arr[j] < minValue) {

                    minValue = arr[j];
                    minIndex = j;
                    incrementAnzahleSchliefe();
                }
                incrementAnzahlVergleiche();
                incrementAnzahleSchliefe();
            }
            if (minValue < arr[i]) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                incrementAnzahleSchliefe();
            }
            incrementAnzahlVergleiche();
            incrementAnzahleSchliefe();
        }

        incrementAnzahleSchliefe();

        incrementAnzahlVergleiche();
        incrementAnzahleSchliefe();


        incrementAnzahlVergleiche();
        incrementAnzahleSchliefe();

    }
}


