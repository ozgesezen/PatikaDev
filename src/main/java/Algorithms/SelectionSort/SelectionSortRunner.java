package Algorithms.SelectionSort;

import java.util.Arrays;

public class SelectionSortRunner {
    public static void main(String[] args) {


        int[] arr = {22, 27, 16, 2, 18, 6};
        System.out.println("Sort islemi oncesi array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("SelectionSort islemi sonrasi array :");
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        //O(n^2)
        //Dizi siralanadiktan sonra 18 average case olur.


    }


}
