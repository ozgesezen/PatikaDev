package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElemanSiralama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i=0; i< arr.length; i++){
            System.out.print((i+1)+". Elemani : ");
            int eleman = input.nextInt();
            arr[i]=eleman;
        }
        Arrays.sort(arr);
        System.out.println("Siralama : "+Arrays.toString(arr));

    }

}
