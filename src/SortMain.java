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

        for (int i = 1; i <= 3; i++) {
            int anzZahlen;
            int[] arr;
            switch (i) {
                case 1:
                    anzZahlen = 10;
                    arr = arr10;
                    aufrufen(arr, anzZahlen);
                    break;
                case 2:
                    anzZahlen = 100;
                    arr = arr100;
                    aufrufen(arr, anzZahlen);
                    break;
                case 3:
                    anzZahlen = 1000;
                    arr = arr1000;
                    aufrufen(arr, anzZahlen);
                    break;
            }


        }


    }

    public static void aufrufen(int[] arr, int anzZahlen) {
        SortWerte bs = new BubbleSort().sort(arr, anzZahlen);
        bs.print();
        SortWerte qs = new Quicksort().sort(arr, anzZahlen);
        qs.print();
        SortWerte ss = new SelectionSort().sort(arr, anzZahlen);
        ss.print();
        SortWerte gs = new Gnomesort().sort(arr, anzZahlen);
        gs.print();
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


