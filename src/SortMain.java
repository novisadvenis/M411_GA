import java.util.Random;

public class SortMain {

    public static void main(String[] args) {
        SortMain sm = new SortMain();
        int[] arr = sm.arrayGenerator(100000,10000000 );
        BubbleSort bs = new BubbleSort();
        double[] zahlen = bs.sort(arr, 100000);
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }

    public int[] arrayGenerator(int size, int largest){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new Random().nextInt(largest);
        }
        return arr;
    }

}
