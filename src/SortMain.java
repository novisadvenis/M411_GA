import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SortMain {

    private static int[] arr10;
    private static int[] arr100;
    private static int[] arr1000;
    private static double[] messWerte;

    public static void main(String[] args) {
        SortMain sm = new SortMain();
        sm.datReader();
        BubbleSort bs = new BubbleSort();
        Quicksort qs = new Quicksort();
        SelectionSort ss = new SelectionSort();

        for (int i = 1; i <= 3; i++) {
            int anzZahlen = 0;
            int[] arr = null;
            switch (i) {
                case 1:
                    anzZahlen = 10;
                    arr = arr10;
                    break;
                case 2:
                    anzZahlen = 100;
                    arr = arr100;
                    break;
                case 3:
                    anzZahlen = 1000;
                    arr = arr1000;
                    break;
            }
            System.out.println(anzZahlen + " Zahlen:");
            messWerte = bs.sort(arr, arr.length);
            System.out.println("\tBubblesort:");
            System.out.println(sm);
            messWerte = qs.sort(arr, arr.length);
            System.out.println("\tQuicksort:");
            System.out.println(sm);
            messWerte = ss.sort(arr, arr.length);
            System.out.println("\tSelectionsort:");
            System.out.println(sm);
        }


    }


    @Override
    public String toString() {
        return
                "\t\tAnzahl Schleifendurchläufe: " + messWerte[0] +
                        "\n\t\tAnzahl Vergleiche:         " + messWerte[2] +
                        "\n\t\tgebrauchte Zeit:           " + messWerte[1];
    }

    private void datReader() {

        int[] arr;

        for (int i = 10; i < 1001; i = i * 10) {
            arr = new int[i];
            String file = "Digits/" + i + "Digits.dat";
            try {
                BufferedReader br = new BufferedReader(
                        new FileReader(file));
                String line;
                for (int j = 0; j < i; j++) {
                    line = br.readLine();
                    arr[j] = Integer.parseInt(line);
                }
                br.close();
            } catch (
                    IOException e) {
                e.printStackTrace();
            }

            switch (arr.length) {
                case 10:
                    arr10 = arr;
                    break;
                case 100:
                    arr100 = arr;
                    break;
                case 1000:
                    arr1000 = arr;
                    break;
            }

        }


    }


}


