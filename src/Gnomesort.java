import java.util.Date;

/**
 * Beschreibung:
 * - Hier kommt die Funktionsweise des Gnomesorts
 *
 * @author  Lakisha Jeyarajah
 * @date    2021-01-21
 * @version 1.0
 */
public class Gnomesort extends SortWerte {
    @Override
    public void logic(int[] arr, int length) {
        long start = new Date().getTime();
        double[] messArr;
        double anzSchleifen = 0;
        double anzVergleiche = 0;
        int index = 0;

        while (index < length) {
            anzVergleiche++;
            if (index == 0) {
                index++;

                anzSchleifen++;
            }
            anzVergleiche++;
            if (arr[index] >= arr[index - 1]) {
                index++;

                anzSchleifen++;
            } else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;

                anzSchleifen++;
            }
            anzVergleiche++;
            anzSchleifen++;
        }
        double time = new Date().getTime()-start;
        messArr = new double[]{anzSchleifen, time, anzVergleiche};
        //return messArr;
    }
}