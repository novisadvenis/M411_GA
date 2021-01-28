import java.util.Date;

/**
 *
 * Beschreibung
 * Einfach und instabil
 * Sortieren durch direktes auswählen
 * best/worst case = O(n^2)
 * Anzahl Vergleiche = n(n-1)/2
 *
 * @version 1.0 vom 21.01.2021
 * @author Kaushall Vimalarajah
 */

public class SelectionSort implements SortInterface{

    @Override
    public double[] sort(int[] arr, int length) {

        long start = new Date().getTime();
        double[] messArr;

        double schleifen = 0;
        double vergleiche = 0;

        int i, j, minValue, minIndex, temp = 0;
        for (i = 0; i < length; i++) {
            vergleiche++;
            minValue = arr[i];
            minIndex = i;
            for (j = i; j < length; j++) {
                vergleiche++;
                if (arr[j] < minValue) {

                    minValue = arr[j];
                    minIndex = j;
                    schleifen++;
                }
                vergleiche++;
                schleifen++;
            }
            if (minValue < arr[i]) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                schleifen++;
            }
            vergleiche++;
            schleifen++;
        }
        double time = new Date().getTime()-start;
        messArr = new double[]{schleifen, time, vergleiche};

        return messArr;
    }





}

