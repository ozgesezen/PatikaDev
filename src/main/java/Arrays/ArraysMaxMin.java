package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMaxMin {

    public static void main(String[] args) {

        int[] arr = {56,34,1,8,101,-2,-33};
        Arrays.sort(arr);
        System.out.println("Arraydeki min deger: "+arr[0]);
        System.out.println("Arraydeki max deger: "+arr[arr.length-1]);

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int enter = input.nextInt();
        int[] copyArray = Arrays.copyOf(arr,8);
        copyArray[arr.length]=enter;
        System.out.println(Arrays.toString(copyArray));
        Arrays.sort(copyArray);
        System.out.println("Girilen sayidan kucuk en yakin deger :"+copyArray[Arrays.binarySearch(copyArray, enter)+1]);
        System.out.println("Girilen sayidan buyuk en yakin deger :"+copyArray[Arrays.binarySearch(copyArray, enter)-1]);


    }

}
