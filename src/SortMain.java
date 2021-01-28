/**
 * @author Viviana Kontos
 * @date 21.01.2021
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SortMain {

    private static int[] arr10;
    private static int[] arr100;
    private static int[] arr1000;



    public static void main(String[] args) {
        SortMain sm = new SortMain();
        sm.datReader();

        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    aufrufen(arr10, arr10.length);
                    break;
                case 2:
                    aufrufen(arr100, arr100.length);
                    break;
                case 3:
                    aufrufen(arr1000, arr1000.length);
                    break;
            }


        }


    }

    public static void aufrufen(int[] arr, int anzZahlen) {
        System.out.println("Sortier Alogorithmus auf "+ arr.length+ " Zahlen");
        System.out.println("==============================================");
        SortWerte bs = new BubbleSort().sort(arr, anzZahlen);
        bs.print();
        SortWerte qs = new Quicksort().sort(arr, anzZahlen);
        qs.print();
        SortWerte ss = new SelectionSort().sort(arr, anzZahlen);
        ss.print();
        SortWerte gs = new Gnomesort().sort(arr, anzZahlen);
        gs.print();
        SortWerte ts = new TimSort().sort(arr,anzZahlen);
        ts.print();

        System.out.println(System.lineSeparator()+System.lineSeparator());
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


