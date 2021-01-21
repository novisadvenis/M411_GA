package SelectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] list) {

        int i, j, minValue, minIndex, temp = 0;
        for (i = 0; i < list.length; i++) {
            minValue = list[i];
            minIndex = i;
            for (j = i; j < list.length; j++) {
                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }
            }
            if (minValue < list[i]) {
                temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
            System.out.print(list[i]+" ");
        }

        return list;
    }

    public static void main(String[] args) {
        int[] list = new int[]{3, 1, 2, 5, 7, 9, 8,4,6};
        selectionSort(list);
        //System.out.println(Arrays.stream(list));
    }
}

