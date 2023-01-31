package Algorithms.MergeSort;

import java.util.Arrays;

public class MergeSortRunner {

    public static void main(String[] args) {

        int[] arr = {16,21,11,8,12,22};
        System.out.println("MergeSort Öncesi Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("MergeSort Sonrası Array : ");
        MergeSort.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}
